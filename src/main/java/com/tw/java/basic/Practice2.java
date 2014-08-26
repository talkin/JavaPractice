package com.tw.java.basic;

public class Practice2 {

//    ---------------------------------
//    值与引用
//    ---------------------------------

    public static void main(String[] args) {
        //值引用
        //基本类型作为参数传递
        String s1 = "hello";
        System.out.println("before change: " + s1);
        changeOne(s1);
        System.out.println("after change: " + s1);

        //对象作为参数传递
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println("before change: " + stringBuffer);
        changeTwo(stringBuffer);
        System.out.println("after change: " + stringBuffer);

    }

    private static void changeTwo(StringBuffer stringBuffer) {
        stringBuffer.append("world");
    }

    private static String changeOne(String s) {
        s += "world";
        return s;
    }

}
