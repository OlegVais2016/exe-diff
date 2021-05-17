package com.example.quiz.diff.diff_1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        System.out.println(list);
        list.add(array[2]);
        System.out.println(list);
        list.set(1, array[1]);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
