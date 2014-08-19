package com.company;

import java.util.*;

public class Practice4_Map {

    public static void main(String[] args) {

        Map map=new HashMap();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("d", "ddd");

        System.out.println("map的大小 ：" + map.size());

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println("map.get(key) is :"+map.get(key));
        }

        System.out.println("\n");


        Hashtable tab=new Hashtable();
        tab.put("a", "aaa");
        tab.put("b", "bbb");
        tab.put("c", "ccc");
        tab.put("d", "ddd");
        Iterator iterator_table = tab.keySet().iterator();
        while (iterator_table.hasNext()) {
            Object key = iterator_table.next();
            System.out.println("tab.get(key) is :"+tab.get(key));
        }

        System.out.println("\n");


        TreeMap tmp=new TreeMap();
        tmp.put("a", "aaa");
        tmp.put("b", "bbb");
        tmp.put("c", "ccc");
        tmp.put("d", "ddd");
        Iterator iterator_tree = tmp.keySet().iterator();
        while (iterator_tree.hasNext()) {
            Object key = iterator_tree.next();
            System.out.println("tmp.get(key) is :"+tmp.get(key));
        }




    }
}
