package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.UserData;
import com.learning.graphqlspringexample.model.User;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author satya
 */
@Component
@Slf4j
public class UserQueryResolver implements GraphQLQueryResolver {
private final UserData userdata;


    public UserQueryResolver(UserData userdata) {
        this.userdata = userdata;
    }

    public List<User> users(){
        return userdata.getUsers();
    }

    public User user(int id){
        return userdata.getUser(id);
    }

    public User me(){
    return userdata.getUsers().get(0);
}


}
