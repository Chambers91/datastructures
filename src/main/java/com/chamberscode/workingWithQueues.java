package com.chamberscode;

import java.util.LinkedList;
import java.util.Queue;

//FIFO - first in first out
public class workingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 11));
        supermarket.add(new Person("John", 18));
        supermarket.add(new Person("Derrick", 12));

        //size shows how many people are in the queue
        System.out.println(supermarket.size());
        //peek shows the first user in the queue
        System.out.println(supermarket.peek());
        //poll retrieves and removes the first user from the queue
        System.out.println(supermarket.poll());
        //size shows the updated amount of people in the queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }
        static record Person(String name, int age) {
        }
        ;
}