package com.company;

public class Practice3 {

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

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };


        //泛型
        System.out.println( "\nArray integerArray contains:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // 传递一个字符型型数组
    }

    private static void changeTwo(StringBuffer stringBuffer) {
        stringBuffer.append("world");
    }

    private static String changeOne(String s) {
        s += "world";
        return s;
    }

    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }
}
