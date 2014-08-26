package com.tw.java.basic;

public class Practice7_TypeChange {
    public static void main(String[] args) {

        System.out.println("将字符串转化为整数");
        String s = "20";
        System.out.println("way 1 : " + Integer.parseInt(s));

        System.out.println("way 2 : " + Integer.valueOf(s).intValue());

        System.out.println("将整数转化为字符串");
        int i = 30;
        System.out.println("way 1 : " + Integer.toString(i));
        System.out.println("way 2 : " + String.valueOf(i));
        System.out.println("way 3 : " + "" + i);

        //Double, Float, Long 转成字串的方法类似

        //转换规则:从存储范围大的类型到存储范围小的类型。
        //具体规则为：double→float→long→int→short(char)→byte




    }
}
