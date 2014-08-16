package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //定义整型
        int a = 5; //5 = 0000 0101
        int b = 3; //3 = 0000 0011

        //定义布尔型
        boolean c = true;
        boolean d = false;

        //定义字符串
        String s = "123";
        System.out.println("q = " + Integer.parseInt(s));

        //定义浮点型
        float pi = 3.14f;
        int x = (int)pi;
        System.out.println(x);

        //定义char型
        char grade = 'a';

        //-------------分支结构-------------
        //if-else语句
        if (c&&d) {
            //算术运算符
            System.out.println("a+b=" + (a + b));
            System.out.println("a-b=" + (a - b));
            System.out.println("a*b=" + a*b);
            System.out.println("a/b=" + a/b);
            System.out.println("a%b=" + a%b);
            System.out.println("a++=" + (a++));
            System.out.println("++b=" + (++b));
            System.out.println("a--=" + (a--));
            System.out.println("--b=" + (--b));
        } else {
            //关系运算符
            System.out.println("a==b = " + (a==b));
            System.out.println("a!=b = " + (a!=b));
            System.out.println("a>b=" + (a>b));
        }

        //switch语句
        switch (grade) {
            case 'a' :
                System.out.println("c&&d = " + (c&&d));        //逻辑运算符
                break;
            case 'b' :
                System.out.println("c||d = " + (c||d));
                break;
            default:
                System.out.println("!c = " + (!c));
        }

        //-------------循环结构-------------
        //while循环
        while (c == d) {
            //位运算符
            System.out.println("a&b = " + (a&b));  //0101 & 0011 = 0001
            System.out.println("a|b = " + (a|b));  //0101 | 0011 = 0111
            System.out.println("a^b = " + (a^b));  //0101 ^ 0011 = 0110
            System.out.println("a>>2 = " + (a>>2));  //0001
            System.out.println("~a = " + (~a));  // ~0000 0101 = 1111 1010
        }

        //do-while循环
        do {
            //赋值运算符
            System.out.println("b+=a = " + (b+=a));
            System.out.println("b+=a = " + (b-=a));
            System.out.println("b*=a = " + (b*=a));
            System.out.println("b/=a = " + (b/=a));
        } while (!c);


        //for循环
        for (int i = 0; i<3; i++) {
            //条件运算符
            b = (a == 1) ? 20: 30;
            System.out.println("b = " + b);
        }

        //-------------数组-------------
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.println(name);
        }

        //-------------集合-------------
        ArrayList<Egg> eggs = new ArrayList<Egg>();

        //向集合中加入元素
        Egg eggOne = new Egg();
        Egg eggTwo = new Egg();
        eggs.add(eggOne);
        eggs.add(eggTwo);

        //查询集合的大小
        int theSize = eggs.size();
        System.out.println(theSize);

        //查询特定元素是否存在
        boolean isIn = eggs.contains(eggOne);
        System.out.println(isIn);

        //查询特定元素的位置
        int index = eggs.indexOf(eggTwo);
        System.out.println(index);

        //判断集合是都为空
        boolean empty = eggs.isEmpty();
        System.out.println(empty);

        //删除元素
        eggs.remove(eggOne);
        System.out.println(eggs.size());

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
