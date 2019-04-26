package com.example.exe_spark;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intersection4 {
    public static void main(String[] args) {

        String[] xarr = {"a","c","a","f"};
        String[] yarr = {"a","d","c"};
        System.out.println(Arrays.toString(xarr));
        System.out.println(Arrays.toString(yarr));

        System.out.println(myIntersect(xarr,yarr));
    }
    private static List<String> myIntersect(String[] xarr, String[]yarr ){
     //   Set<String> xarrNew = Stream.of(xarr).collect(Collectors.toSet());
        Set<String> xarrNew = Arrays.stream(xarr).collect(Collectors.toSet());
        System.out.println(xarrNew);
        return Stream.of(yarr).filter(xarrNew::contains).collect(Collectors.toList());
    }
}
