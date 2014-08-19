package com.company;

import java.util.Arrays;

public class Practice5_Array {

    public static void main(String[] args) {

        //-------------数组-------------
        Integer[] numbers ={5, 8, 3, 6, 1};


        listAllNumbers(numbers);

        int length = numbers.length;
        System.out.println("\n数组长度 ：" + length);

        System.out.print("对数组进行排序，");
        Arrays.sort(numbers);

        listAllNumbers(numbers);

    }

    private static void listAllNumbers(Integer[] numbers) {
        System.out.print("遍历数组中的元素 : ");
        for (Integer number : numbers) {
            System.out.print(number);
        }
    }


}
