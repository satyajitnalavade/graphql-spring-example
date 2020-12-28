package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.CarData;
import com.learning.graphqlspringexample.model.Car;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author satya
 */
@Component
public class CarQueryResolver implements GraphQLQueryResolver {
    private final CarData carData;

    public CarQueryResolver(CarData carData) {
        this.carData = carData;
    }

    public List<Car> cars(){
        return carData.getAllCars();
    }

    public Car car(int id){
        return carData.getCar(id);
    }



}
