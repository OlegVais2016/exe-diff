package com.example.binary;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        Integer[] arr = {44,78,55,12,99};
        Arrays.sort(arr);


        System.out.print(bin(arr,44));
    }
    public static int bin(Integer[]arr,Integer number){
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (number < arr[mid]){
                high = mid - 1;
            }
            else if (number > arr[mid]){
                low = mid + 1;
            }
            else if (number == arr[mid]) {
                index = mid;
                break;
            }
        }

        return index;

    }
}
