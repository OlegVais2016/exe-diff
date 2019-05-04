package com.example.exe_diff;

public class Test_1 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 5;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        /*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }*/

        System.out.println(counter(array));
    }
    public static int counter(int[][] array ){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i!=j && array[i][j] == array[i][j]) {
                    System.out.println("yes");
                }
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
        return count;
    }
}
