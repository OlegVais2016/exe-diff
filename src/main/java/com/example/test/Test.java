package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String args[]) {

//        String str = new String("Добро-пожаловать-на-ProgLang.su");
//
//        System.out.println("Возвращаемое значение: ");
//        for (String retval : str.split("-")) {
//            System.out.println(retval);
//        }
        String s = "Hello";
        String[] a = s.split("");
        List<String> b = Arrays.asList(a);
        System.out.println(b);
//        for(String c : b) {
//            System.out.println(c);
//        }
        String d = b.stream()
                .map(Object ::toString)
                .collect(Collectors.joining());
        System.out.println(d);
        String[] e = b.toArray(new String[b.size()]);
       // System.out.println(Arrays.toString(e));
        String f = Arrays.toString(e);
        System.out.println(f);
        System.out.println(s);
        int length = s.length();
        System.out.println(s.substring(0,length/2));
    }
}
