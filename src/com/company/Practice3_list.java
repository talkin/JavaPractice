package com.company;

import com.company.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Practice3_list {

    public static void main(String[] args) {

        //--------------list--------------
        List<User> users = new ArrayList<User>();

        User user1 = new User();
        user1.setName("a");
        user1.setOrder(3);

        User user2 = new User();
        user2.setName("b");
        user2.setOrder(2);

        User user3 = new User();
        user3.setName("c");
        user3.setOrder(1);

        //向集合中加入元素
        users.add(user1);
        users.add(user2);
        users.add(user3);

        //查询集合的大小
        int theSize = users.size();
        System.out.println("查询集合的大小 : " + theSize);

        //查询特定元素是否存在
        boolean isIn = users.contains(user1);
        System.out.println("查询特定元素是否存在 : " +isIn);

        //查询特定元素的位置
        int index = users.indexOf(user2);
        System.out.println("查询指定元素 : " + index);

        //判断集合是都为空
        boolean empty = users.isEmpty();
        System.out.println("判断集合是都为空 : " + empty);

        //删除元素
        users.remove(user1);
        System.out.println("删除元素 : " + users.size());

        //排序
        System.out.println("排序前 ： ");
        getUsers(users);

        Collections.sort(users, new Comparator<User>() {
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
