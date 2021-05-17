package com.example.exe_diff.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,9,5,4,9);
        System.out.println(list);
        List<Integer> list1 = list.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(list1);
    }

}
