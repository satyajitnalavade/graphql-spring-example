package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.UserData;
import com.learning.graphqlspringexample.model.Car;
import com.learning.graphqlspringexample.model.User;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author satya
 */
@Slf4j
@Component
public class OwnerResolver implements GraphQLResolver<Car> {
    private final UserData userData;

    public OwnerResolver(UserData userData) {
        this.userData = userData;
    }

    public User owner(Car car){
        log.info("Requesting owner data for car owner id {}",car.getOwnedBy());
        return userData.getUser(car.getOwnedBy());
    }
}
