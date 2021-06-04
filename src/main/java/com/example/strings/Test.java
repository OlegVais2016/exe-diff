package com.example.strings;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(getLength("oiuy"));
        System.out.println(getLengthChar("Uhytgfrdfff"));
    }
    public static int getLength(String str){

        String[]arr = str.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
    public static int getLengthChar(String str){

        char[] ch = str.toCharArray();

        int count = 0;
        for ( char c : ch) {
            count++;
        }
        return count;
    }

}
