package com.example.quiz.diff.diff_1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        // list.add(7);
        for (String s : list)
            System.out.print(s);
        System.out.println("-----------");
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        System.out.println(values);
        values.set(1, 6);
        System.out.println(values);
        values.remove(0);
        for (Integer v : values)
            System.out.print(v);
    }
}
