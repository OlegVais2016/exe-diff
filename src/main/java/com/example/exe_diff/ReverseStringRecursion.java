package com.example.exe_diff;

public class ReverseStringRecursion {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(reverseStringWithRecursion("hello"));

    }

    public static String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();
        System.out.println(length);
        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);
        System.out.println(leftPart);
        rightPart = inputString.substring(length / 2, length);
        System.out.println(rightPart);
        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
