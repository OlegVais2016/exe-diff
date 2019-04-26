package com.example.exe_spark;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intersection3 {

    public static void main(String[] args) {
        List<String> xarr = new ArrayList<>();
        List<String> yarr = new ArrayList<>();

        xarr.add("a");
        xarr.add("c");
        xarr.add("a");
        xarr.add("f");
        yarr.add("a");
        yarr.add("d");
        yarr.add("c");

        System.out.println(xarr);
        System.out.println(yarr);
        System.out.println(myIntersect(xarr,yarr));
    }
    static List<String> myIntersect(List<String> xarr, List<String> yarr){
        Set<String> xSet = new HashSet<>(xarr);
        List<String> result = new LinkedList<>();
        for (String y:yarr){
            if (xSet.contains(y)){
                result.add(y);
            }
        }
        return result;
    }



}




    /*static <T> List<T> myIntersect(List<T> xarr, List<T> yarr){
        Set<T> xSet = new HashSet<>(xarr);
        List<T> result = new LinkedList<>();
        for (T y:yarr){
            if (xSet.contains(y)){
                result.add(y);
            }
        }
        return result;
    }*/