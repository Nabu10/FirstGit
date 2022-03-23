package com.fibSeries;

import javafx.beans.binding.MapExpression;

import java.util.*;

public class FibS {
    public static void main(String args[]) {

         String name = "aditya pradhan";

         char[] chars = name.toCharArray();

        Map<Character , Integer> nameMap = new HashMap<>();


        Map map = new HashMap();
        map.put("ram","ramchandra");



        List list1 = new ArrayList();
        list1.add(1);
        list1.add(3);
        list1.add(5);


        List list2 = new ArrayList();
        list2.add(2);
        list2.add(4);
        list2.add(6);


        Map evenoddmap = new HashMap();
        evenoddmap.put("odd", list1);
        evenoddmap.put("even",list2);

        System.out.println(evenoddmap);

        evenoddmap.put("odd", 3);

        System.out.println(evenoddmap);


        Set keyset = map.keySet();

        for(Object obj:keyset){

           System.out.println(evenoddmap.get(obj));}
//      //        map.get("ram");
//        System.out.println(map.get("ram"));


        //        List<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(list.size()-1));







    }

    }

