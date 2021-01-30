package com.example.dir;

import java.io.File;
import java.io.IOException;

public class Dir {
   public static final String DIR1 = "/home/oleg/Desktop/interview";

    public static void main(String[] args) throws IOException {
        File dir1 = new File(DIR1);
        if(!dir1.exists()){
            dir1.mkdir();
        }

        File file2 = new File(dir1, "Lola.docx");
        file2.createNewFile();

        if(dir1.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir1.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t folder");
                }
                else{

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}

