package com.chamberscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

//FIFO - first in first out
public class workingWithQueues {
    public static void main(String[] args) {

        //linked list
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexis", 31));
        linkedList.add(new Person("Ally", 18));
        linkedList.addFirst(new Person("Tommy", 33));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext())
            System.out.println(personListIterator.next());
        System.out.println();

        while (personListIterator.hasNext())
            System.out.println(personListIterator.previous());
    }

    private static void queues() {
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
}