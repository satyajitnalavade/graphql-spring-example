package com.learning.graphqlspringexample.data;

import com.learning.graphqlspringexample.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author satya
 */
@Component
public class UserData {
    private final List<User> users = new ArrayList<>();
    
    public UserData() {
        users.add(new User(1,"Satya",new Integer[]{1,3}));
        users.add(new User(2,"Sumit",new Integer[]{}));
        users.add(new User(3, "Vaishali",new Integer[]{3}));
        users.add(new User(4, "Arjun",new Integer[]{}));
    }

    public User getUser(int id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public List<User> getUsers(){
        return users;
    }

    public void saveUser (User user){
        users.add(user);
    }

}
