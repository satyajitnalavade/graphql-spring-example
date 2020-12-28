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
public class User {

    private Integer id;
    private String name;
    private Integer[] vehicleIds;
}
