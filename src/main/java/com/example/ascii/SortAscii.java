package com.example.ascii;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class SortAscii {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     Files.newBufferedReader(Paths.get
                               ("src/main/java/com/example/ascii/textFile.txt"))){
                             String str = reader.readLine();
            System.out.println(str);
            System.out.println(sortChar(str));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static StringBuilder sortChar(String str){
        int[] arr = new int[256];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[ch]++;
            System.out.println(Arrays.toString(arr));
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 255; i++) {
            for (int j = 0; j < arr[i]; j++) {
                res.append((char) i);
            }
        }
        return  res;
    }
}