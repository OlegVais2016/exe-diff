package com.example.nulls;
/* мы в методe changeIt используем копию ссылки (reference)
        на тот же самый объект строки "Value 1". String является неизменяемым (immutable),
        поэтому в методе changeIt при присваивании s = "Value 2"
        у нас создается новый объект String. Итого имеем две ссылки
        (статическое поле "str" и локальная ссылка "s",
        ссылающиеся на "Value 1" и "Value 2" соответственно.
        Следовательно, статическое поле str не меняется.*/
public class Transfer {

    static String str = "Value 1";

    public static void changeIt(String s) {
        s = "Value 2";
    }
    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}
