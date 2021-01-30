package com.example.test;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[]arr = {1,9,9,6,5,4,1};

        System.out.println(Arrays.toString(removeD(arr)));

    }
    public static int[] removeD(int[] a){
        return Arrays.stream(a)
                .distinct()
                .toArray();
    }
}
