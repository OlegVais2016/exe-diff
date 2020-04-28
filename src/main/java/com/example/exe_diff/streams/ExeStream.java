package com.example.exe_diff.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class ExeStream {



    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.println(collection);
        collection.stream().filter("a1"::equals).count();
        System.out.println(collection.stream().filter("a1"::equals).count());
        System.out.println(collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream()
                .skip(collection.size() - 1).findAny().orElse("0"));
    }
}




