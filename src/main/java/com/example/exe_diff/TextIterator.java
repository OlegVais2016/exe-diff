package com.example.exe_diff;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextIterator {

    public static void main(String[] args) {

        String str = "Lora wants eat eager";
        Iterator<String> tt = getWords(str);
        while(tt.hasNext()){
            System.out.println(tt.next());
        }


    }
    public static Iterator<String> getWords(String text) {
        List<String> words = new ArrayList<>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

        return words.iterator();
    }
}
