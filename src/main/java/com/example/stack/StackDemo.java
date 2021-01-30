package com.example.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("Втолкнуть(" + a + ")");
        System.out.println("Стек: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("Выстрелить -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Стек: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("Стек: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("Пустой стек");
        }
    }
}
