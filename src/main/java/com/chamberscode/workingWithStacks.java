package com.chamberscode;

import java.util.Stack;

public class workingWithStacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
    //push an integer in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
  //to find out what is at the top of the stack
        System.out.println(stack.peek());
        System.out.println(stack.size());
//will remove last integer in stack
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
