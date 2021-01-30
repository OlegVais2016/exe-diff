package com.example.recursion;

public class SubString {

    public static void main(String[] args) {
        System.out.println(isSubstring("Hello","Hell"));
    }

    public static boolean isSubstring( String a,  String b) {
        if (b.length() == 0) {
            return true;
        }

        if ((a.length() == 0) || (a.length() < b.length())) {
            return false;
        }

        if (a.charAt(0) != b.charAt(0)) {
            return isSubstring(a.substring(1), b);
        }

        if (!isSubstringAdd(a.substring(1), b.substring(1))) {
            return isSubstring(a.substring(1), b);
        }

        return true;
    }

    public static boolean isSubstringAdd(String a, String b) {
        if (b.length() == 0) {
            return true;
        }

        if (a.charAt(0) == b.charAt(0)) {
            return isSubstringAdd(a.substring(1), b.substring(1));
        }

        return false;
    }

}
