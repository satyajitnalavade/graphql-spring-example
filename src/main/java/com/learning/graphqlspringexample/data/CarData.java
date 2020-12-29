package com.learning.graphqlspringexample.data;

import com.learning.graphqlspringexample.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author satya
 */
@Component
public class CarData {

    private final List<Car>cars = new ArrayList<>();

    public CarData(){
        cars.add(Car.builder().id(1).make("Honda").model("Odyssey").color("Brown").ownedBy(1).build());
        cars.add(Car.builder().id(2).make("Toyota").model("Corolla").color("Blue").ownedBy(3).build());
        cars.add( Car.builder().id(2).make("Oldsmobile").model("Intrigue").color("Silver").ownedBy(1).build());
    }

    public Car getCar(int id){
        return cars.stream().filter(car -> car.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Car> getAllCars(){
        return cars;
    }

    public void saveCar(Car car){
        cars.add(car);
    }


    public Boolean removeCar(int carId) {
        Predicate<Car> isQualified = car -> car.getId().equals(carId);
        return cars.removeIf(isQualified);

    }
}
