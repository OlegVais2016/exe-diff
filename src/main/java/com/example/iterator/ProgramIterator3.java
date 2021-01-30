package com.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProgramIterator3 {

    public static void main(String[] args) {

        Integer[] arr = {4,5,7,4,8,7,2,9};
        int sum = 0;
        for(int i =0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        List<Integer> array = Arrays.asList(arr);
        List<Integer> arrayList = new ArrayList<>(array);
        System.out.println(arrayList);

        System.out.println(removeOddNumbers(arrayList));
    }
    public static List<Integer> removeOddNumbers(List<Integer> arrayList) {
        Iterator itr = arrayList.iterator();

        while (itr.hasNext())
        {
            int x = (Integer) itr.next();
            if (x % 2 != 0) {
                itr.remove();
             //   System.out.println(itr.next());
            }
        }
        return arrayList;
    }

}
