package com.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ProgramIterator {

    public static void main(String[] args) {

        System.out.println(10 + 20 + "LLL");
        System.out.println("LLL" + 10 + 20);

    ArrayList<String> states = new ArrayList<>();
                states.add("Germany");
                states.add("France");
                states.add("Italy");
                states.add("Spain");
                System.out.println(states);
                Iterator<String> iter = states.iterator();
        while(iter.hasNext()){

        System.out.println(iter.next());

        }
    }

}

