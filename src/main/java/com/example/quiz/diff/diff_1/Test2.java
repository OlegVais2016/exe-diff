package com.example.quiz.diff.diff_1;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pol");
        map.put(2,"Lora");
        map.put(null,"null");
        map.put(null,"lop");
        map.put(2,"Dora");
        System.out.println(map);
        System.out.println(map.size());
    }
}
