package com.example.exe_spark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection5 {
    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a);
        System.out.println(intersect(a));
    }
    public static List<String> intersect(String a){
        String[]arr = a.split(" ");

        return Arrays.asList(arr);
    }
}
