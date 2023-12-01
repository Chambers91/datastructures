package com.chamberscode;

import java.util.ArrayList;
import java.util.List;
//COLLECTION OF ELEMENTS
//arraylist is used a lot
public class WorkingWithLists {
     public static void main(String[] args){

         //only Strings elements are permitted
         List<String> colors = new ArrayList<>();
         colors.add("blue");
         colors.add("purple");
         colors.add("yellow");
         System.out.println(colors.size());
         System.out.println(colors.contains("yellow"));
         System.out.println(colors.contains("pink"));

         System.out.println(colors);

         for(String color : colors) {
             System.out.println(color);


         }
     }
}
