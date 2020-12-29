package com.learning.graphqlspringexample.model;

import lombok.*;

/**
 * @author satya
 */
@Builder
@Value
@AllArgsConstructor
public class Car {
    Integer id;
    String make;
    String model;
    String color;
    Integer ownedBy;


}
