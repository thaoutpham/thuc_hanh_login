package com.codegym.dao;

import com.codegym.mode.Login;
import com.codegym.mode.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users=new ArrayList<>();
        User user=new User();
        user.setAccount("thao");
        user.setPassword("123");
        user.setName("Pham Tuan Thao");
        user.setEmail("thao123");
        user.setAge(21);
        users.add(user);

        User user1=new User();
        user1.setAccount("sinh");
        user1.setPassword("123");
        user1.setName("sinh");
        user1.setEmail("sinh123");
        user1.setAge(21);
        users.add(user1);

        User user2=new User();
        user2.setAccount("hong");
        user2.setPassword("123");
        user2.setName("hong");
        user2.setEmail("hong123");
        user2.setAge(21);
        users.add(user2);
    }
    public static  User check(Login login){
        for(User u:users){
            if(u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
