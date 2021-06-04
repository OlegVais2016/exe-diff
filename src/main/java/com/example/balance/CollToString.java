package com.example.balance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollToString {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(collToString(l));
    }



    public static int collToString(List<Integer> list){

        String listString = list.stream().map(Object::toString)
                .collect(Collectors.joining());

        int res = Integer.parseInt(listString);
        return res*2;
    }
}
