package com.learning.graphqlspringexample.data;

import com.learning.graphqlspringexample.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author satya
 */
@Component
public class UserData {
    private List<User> users = new ArrayList<>();
    
    public UserData() {
        users.add(User.builder().id(1).name("Satya").vehicleIds(new Integer[]{1,3}).build());
        users.add( User.builder().id(2).name("Sumit").vehicleIds(new Integer[]{}).build());
        users.add( User.builder().id(3).name("Vaishali").vehicleIds(new Integer[]{2}).build());
        users.add(User.builder().id(4).name("Arjun").vehicleIds(new Integer[]{}).build());

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

    public Boolean removeUser(int userId){
        Predicate<User> isQualified = user -> user.getId().equals(userId);
        return users.removeIf(isQualified);

//        if (users.stream().anyMatch(isQualified)){
//            return users.removeIf(isQualified);
//        }
//        else {
//            return false;
//        }

//        if (users.stream().filter(isQualified).count() > 0) {
//            users.removeIf(isQualified);
//            return true;
//        }

    }


}
