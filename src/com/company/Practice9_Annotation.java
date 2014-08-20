package com.company;

import com.company.Annnocations.Author;

public class Practice9_Annotation {

    public static void main(String[] args) {
        System.out.println(work());
    }

    @Author(name = "jing001",group="com.thoughtworks")
    public static String work()
    {
        return "work over!";
    }
}
