package com.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProgramIterator4 {

    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        System.out.println(al);
        Integer[] arr = {4,5,7,4,8,7,2};
        List<Integer> a = Arrays.asList(arr);
        System.out.println(a);
        List<Integer> list = new ArrayList<>(a);
        System.out.println(list);
        // Remove elements smaller than 10 using
        // Iterator.remove()
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            int x = (Integer) itr.next();
            if (x % 2 != 0)
                itr.remove();
        }

        System.out.println("Modified ArrayList : "
                + list);
    }
}
