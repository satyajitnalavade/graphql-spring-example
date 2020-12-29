package com.learning.graphqlspringexample.model;

import lombok.*;

/**
 * @author satya
 */
@Builder
@Value
@AllArgsConstructor
public class User {

    Integer id;
    String name;
    Integer[] vehicleIds;
}
