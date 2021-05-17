package com.example.compress;

public class B {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("aaabgfrtttgfdkkkkkkkk");
        String str = sb.toString();
        System.out.println(stringBuilderSolution(str));

        String[] data = new String[] {
                "aabcccccaaa",
                "aabc",
                "aaaa"
        };

        for (String d : data) {
            System.out.println(stringBuilderSolution(d));
        }
    }

    public static String stringBuilderSolution(String str) {
        int length = str.length();
        char current = str.charAt(0);
        int count = 0;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c == current) {
                count++;
            } else {
                compressed.append(current).append(count);
                current = c;
                count = 1;
            }
        }
        compressed.append(current).append(count);

        return compressed.length() < length ? compressed.toString() : str;
    }
}
