package com.chamberscode;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args){
        //array practice in reference to amigoscode yt channel
        //declaring an array with the data type of String and the name colors with a String array Index of 5
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "red";
        colors[2] = "green";

        System.out.println(Arrays.toString(colors));
      //  System.out.println(colors[0]);

//for loop
for (int i = 0; i < colors.length; i++) {

    System.out.println(colors[i]);
}
        //reverse
        for (int i = colors.length -1; i>= 0; i--) {
            System.out.println(colors[i]);
        }

        //arrays can hold primitive data types and objects
//declaring an array of data type string with the variable friendsArray
        //declaring that there will only be a fixed size of 4 Strings within the initialized array
//        String[] friendsArray = new String[4];
//
//        //option2 : declare the values within the array
//        String[] friendsArray2 = {"Jon", "Chris", "Don", "Luke"};
//
//
//        //declaring an arraylist of Strings
//        //arraylist do not have a fixed size
//        //arraylist can only hold objects
//        ArrayList<String> friendsArrayList = new ArrayList<>();
//
//        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Jon", "Chris", "Luke", "Timmy"));
//
//        //get elements
//        System.out.println(friendsArray2[1]);
//        System.out.println(friendsArrayList2.get(2));
//
//        System.out.println(friendsArray2.length);
//        System.out.println(friendsArrayList2.size());
//
//        //remove an element stored in the 3rd index of the arraylist
//        friendsArrayList2.remove(2);
//        //remove element by name
//        friendsArrayList2.remove("Luke");
//        //arraylist are better and more flexible than arrays
    }


}
