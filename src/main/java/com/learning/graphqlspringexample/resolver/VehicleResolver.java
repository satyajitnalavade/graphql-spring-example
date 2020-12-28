package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.CarData;
import com.learning.graphqlspringexample.model.Car;
import com.learning.graphqlspringexample.model.User;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author satya
 */
@Slf4j
@Component
public class VehicleResolver implements GraphQLResolver<User> {

    private final CarData carData;

    public VehicleResolver(CarData carData) {
        this.carData = carData;
    }

    public List<Car> vehicles(User user) {
        return Arrays.stream(user.getVehicleIds()).map(integer -> { return carData.getCar(integer);}).collect(Collectors.toList());
    }


}
