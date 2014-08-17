package com.company;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;


public class Practice2 {

//    ---------------------------------
//    数组 & 集合
//    ---------------------------------

    public static void main(String[] args) {

        //-------------数组-------------
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        System.out.println("遍历数组中的元素 : ");
        for (String name : names) {
            System.out.println(name);
        }

        //-------------集合-------------
        List<User> users = new ArrayList<User>();

        //向集合中加入元素
        User userOne = new User();
        User userTwo = new User();
        users.add(userOne);
        users.add(userTwo);

        //查询集合的大小
        int theSize = users.size();
        System.out.println("查询集合的大小 : " + theSize);

        //查询特定元素是否存在
        boolean isIn = users.contains(userOne);
        System.out.println("查询特定元素是否存在 : " +isIn);

        //查询特定元素的位置
        int index = users.indexOf(userTwo);
        System.out.println("查询指定元素 : " + index);

        //判断集合是都为空
        boolean empty = users.isEmpty();
        System.out.println("判断集合是都为空 : " + empty);

        //删除元素
        users.remove(userOne);
        System.out.println("删除元素 : " + users.size());

    }
}
