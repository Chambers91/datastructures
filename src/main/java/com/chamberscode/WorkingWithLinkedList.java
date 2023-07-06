package com.chamberscode;

import java.util.LinkedList;

public class WorkingWithLinkedList {

    //Types of linked list
    //single linked list - navigation is forward only
    //- made up of *nodes* that consists of two parts, data and link
    //example : Suppose we want to store a list of numbers: 11,21,19,91
    // each number will have its own node |11|2000|  |21|3000| |19|4000| |91|null|
    //                   node addresses:  1000       2000      3000      4000
    //having each address connected to a different node, they are reachable
    //first pointer should allow you to access the head pointer

    // doubly linked list - forward and backward navigation is possible
    //circular linked list - last element is linked to the first element

    public static void main(String[] args){
        LinkedList linky = new LinkedList();
        linky.add("Terence");
        linky.add("Jon");
        linky.add("Lonny");

        linky.clear();

        System.out.println(linky);
//class Node{
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
////creating new objects
//
//        Node head = new Node(11);
//        Node nodeB = new Node(21);
//        Node nodeC = new Node(19);
//        Node nodeD = new Node(91);
//
//        head.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//    }
//
//   public static int countNodes(Node head) {
//       int count = 1;
//       Node current = head;
//       while (current.next != null) {
//           current = current.next;
//           count += 1;
//       }
//       return count;
//   }}

    }

}
