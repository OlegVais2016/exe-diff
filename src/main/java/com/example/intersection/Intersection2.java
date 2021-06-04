package com.example.intersection;

public class Intersection2 {
    public static void main(String[] args) {
        int number = 123456;
        int start = 2;
        int end = 5;
        System.out.println(subString(number, start, end));
        System.out.println(recursiveSubString(number, start, end,numberLength(-123456,0),0));
        System.out.println(numberLength(123456,1));
    }
    private static int numberLength(int num, int counter){
        if(num == 1){
            return counter;
        }
        return numberLength(Math.abs(num/10), ++counter);
    }

    private static int subString (int number, int start, int end){
        int length = numberLength(number,1);
        System.out.println(length);
        if (end > length || start < 0 || start > length || end < 0) return 0;
        int res = 0;
        for (int i = start; i <= end; i++) {
            int x = (int) (number/Math.pow(10,length-i))%10;
            int y = (int) (x * Math.pow(10, length-i));
            res += y/Math.pow(10, length - end);
        }
        return res;
    }

    private static int recursiveSubString(int number, int start, int end, int length,int res){
        if(start > end || end > length || start < 0 || end < 0) return res;
        int x = (int) (number/Math.pow(10,length-start))%10;
        int y = (int) (x * Math.pow(10, length-start));
        res += y/Math.pow(10, length - end);
        return recursiveSubString(number,++start,end,length, res);
    }
}
