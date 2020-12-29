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
        cars.add(new Car(1,"Honda","Odyssey","Brown",1));
        cars.add(new Car (2,"Toyota", "Corolla", "Blue",3));
        cars.add(new Car (3,"Oldsmobile","Intrigue","Silver",1));
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
