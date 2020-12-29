package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.CarData;
import com.learning.graphqlspringexample.model.Car;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author satya
 */
@Slf4j
@Component
public class CarMutationResolver implements GraphQLMutationResolver {

    private final CarData carData;



    public CarMutationResolver(CarData carData) {
        this.carData = carData;
    }

    public Car createCar(int id, String make, String model, String color){
        Car car = new Car(id,make,model,color,0);
        carData.saveCar(car);
        return car;
    }

    public Boolean deleteCar(int carId){
        return carData.removeCar(carId);
    }


}
