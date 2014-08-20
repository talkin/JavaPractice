package com.company;

import com.company.model.Note;

import java.util.ArrayList;

public class Practice8_Generics {
    public static void main(String[] args) {

        //Java SE1.5中增加了新特性：泛型
        //不指定某种特定的对象类型，即将所操作的数据类型参数化

        System.out.print("-----------------普通泛型--------------------");
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        //泛型
        System.out.println( "\nArray integerArray contains:" );
        printArray(intArray); // 传递一个整型数组

        System.out.println( "\nArray doubleArray contains:" );
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println( "\nArray characterArray contains:" );
        printArray(charArray); // 传递一个字符型型数组


        System.out.println("-----------------通配符--------------------");
        Note<String, Integer> note1;
        note1 = new Note<String, Integer>();
        note1.setKey("Tom");
        note1.setValue(23);
        printInfo(note1);

        Note<String, String> note2;
        note2 = new Note<String, String>();
        note2.setKey("Lily");
        note2.setValue("USA");
        printInfo(note2);


        //-----test------
        ArrayList<String> list1 = new ArrayList();
        list1.add("1");
        //list1.add(1);   编译错误
        String s = list1.get(0);
        System.out.println(s);
        System.out.println(Integer.parseInt(list1.get(0)));


        ArrayList list2 = new ArrayList<String>();
        list2.add(1);
        Object o = list2.get(0);
        System.out.println(o);

        ArrayList list3 = new ArrayList();
        list3.add("1");

    }

    // <?>可以接收任意的泛型对象 (通配符)
    private static void printInfo(Note<?,?> temp) {
        System.out.println("name : " + temp.getKey());
        System.out.println("country : " + temp.getValue());

    }

    public static <E> void printArray(E[] inputArray) {

        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }

}
