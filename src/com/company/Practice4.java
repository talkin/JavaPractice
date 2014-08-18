package com.company;

import com.company.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice4 {

//    ---------------------------------
//    list 排序
//    ---------------------------------

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("a");
        user1.setOrder(3);

        User user2 = new User();
        user2.setName("b");
        user2.setOrder(2);

        User user3 = new User();
        user3.setName("c");
        user3.setOrder(1);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println("排序前 ： ");
        getUsers(users);

        Collections.sort(users, new Comparator<User>(){
            public int compare(User user1, User user2) {
                return user1.compareTo(user2);
            }
        });

        System.out.println("排序后 ： ");
        getUsers(users);
    }

    private static void getUsers(List<User> users) {
        for(User user : users){
            System.out.println(user.getName());
        }
    }
}
