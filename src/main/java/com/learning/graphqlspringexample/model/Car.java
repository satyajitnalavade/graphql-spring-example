package com.learning.graphqlspringexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author satya
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    Integer id;
    String make;
    String model;
    String color;
    Integer ownedBy;
}
