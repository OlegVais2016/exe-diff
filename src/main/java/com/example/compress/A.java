package com.example.compress;

public class A {
    public static void main(String[] args) {

        String[] data = new String[] {
                "aabcccccaaa",
                "aabc",
                "aaaa"
        };

        for (String d : data) {
            System.out.println(compress(d));
        }

    }

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();

        // Add first character to compressed result
        char currentChar = str.charAt(0);
        compressed.append(currentChar);

        // Always have a count of 1
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char nextChar = str.charAt(i);
            if (currentChar == nextChar) {
                count++;
            } else {
                // Append the count of the current character
                compressed.append(count);

                // Set the current character and count
                currentChar = nextChar;
                count = 1;

                // Append the new current character
                compressed.append(currentChar);
            }
        }
        // Append the count of the last character
        compressed.append(count);
        System.out.println(compressed);
        // If the compressed string is not smaller than the original string, then return the original string
        return (compressed.length() < str.length() ? compressed.toString() : str);
    }
}
