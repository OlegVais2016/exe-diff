package com.example.stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> deck = new Stack<>();
        deck.push(9);
        deck.push(65);
        deck.push(45);
        System.out.println(deck);
        deck.pop();
        System.out.println(deck);
   //     deck.peek();
        System.out.println(deck.peek());
   //     System.out.println(peekMyStack(deck));
    }
   /* public static Integer peekMyStack(Stack s){
        return (Integer) s.peek();

    }*/
}
