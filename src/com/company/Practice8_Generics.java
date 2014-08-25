package com.company;

import com.company.model.Note;

import java.util.ArrayList;
import java.util.List;

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


        System.out.println("-----------------test--------------------");
        ArrayList<String> list1 = new ArrayList();
        list1.add("2");
        //list1.add(1);   编译错误
        String s = list1.get(0);
        System.out.println(s);
        System.out.println(Integer.parseInt(list1.get(0)));


        ArrayList list2 = new ArrayList<String>();
        list2.add(3);
        Object o = list2.get(0);
        System.out.println(o);

        ArrayList list3 = new ArrayList();
        list3.add("1");



        Print print = new Print();
        String o1 = "111111111111";
        print.show(123);
        print.show(123f);
        print.show(123.00);

        choose(print);

        List<? extends Number> numbers = new ArrayList<Number>();
//        List<Number> numbers1 = new ArrayList<? extends Number>();//不可行

        List<? super Number> integers = new ArrayList<Number>();
        integers.add(11);
        Object o2 = integers.get(0);

        List<? extends Number> n1 = new ArrayList<Integer>();

//        List<Number> numbers1 = new ArrayList<? extends Number>();//不可行
        List<? extends Number> numbers2 = new ArrayList<Integer>();
        List<? extends Object> numbers3 = new ArrayList<Integer>();
//        numbers.add(11);//不可行
    }

    private void testA(List<? extends Number> numbers) {

    }

    private static void choose(Object o) {
        System.out.println("22222222222222");
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


    static class Print<T extends Number> {
        public T show(T content) {
            System.out.println(content);
            return content;
        }

    }



}

