package com.chamberscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    //a map cannot contain duplicate keys
    //each key can map to at most one value

    public static void main(String[] args){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alan"));
        map.put(3, new Person("Andy"));

        System.out.println(map);
        //displays the amount of entrys recorded in the data
        System.out.println(map.size());
        //displays 1st entry
        System.out.println(map.get(1));
        //boolean - counts the amount of entrys
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        //displays all data that has been entered
        System.out.println(map.entrySet());


        map.entrySet().forEach(x -> System.out.println(x.getKey()+ " " +x.getValue()));

    }
    record Person(String name){}
}
