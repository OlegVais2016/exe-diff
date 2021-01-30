package com.example.dir;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDeleteDirectoryExample {

    private static final String DIR = "/home/oleg/Desktop/diff";

    public static void main(String[] args) throws IOException {
        String s1 = "Test";
        s1 = "TestUpdated";
        System.out.println(s1);
        File dir = new File(DIR);
        if (!dir.exists())
            dir.mkdir();

        File file = new File(dir, "Lola.docx");
        file.createNewFile();
       /* File[] listFiles = dir.listFiles();
        for (File f : listFiles) {
            f.delete();
        }
        dir.delete();*/
        List<Integer> list = new ArrayList<>();
        List<Integer > synchronizedList = Collections.synchronizedList(list);

    }
}
