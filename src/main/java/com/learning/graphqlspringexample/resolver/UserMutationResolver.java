package com.learning.graphqlspringexample.resolver;

import com.learning.graphqlspringexample.data.UserData;
import com.learning.graphqlspringexample.model.User;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author satya
 */
@Component
@Slf4j
public class UserMutationResolver implements GraphQLMutationResolver {
    private final UserData userData;

    public UserMutationResolver(UserData userData) {
        this.userData = userData;
    }

    public User makeUser(int id, String name){
        User newUser = new User(id,name,new Integer[]{});
        userData.saveUser(newUser);
        return newUser;
    }

    public Boolean deleteUser(int userId){
        return userData.removeUser(userId);
    }

}
