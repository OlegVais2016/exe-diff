package com.example.class_;

public class Test {
    public static void main(String[] args)
    {
        //there is no instance available for class Test, so use Test.class
        System.out.println("Test.class.getName() ::: " + Test.class.getName());

        // Now create an instance of class Test use getClass()
        Test testObj = new Test();
        System.out.println("testObj.getClass().getName() ::: " + testObj.getClass().getName());

        //For primitive type
        System.out.println("boolean.class.getName() ::: " + boolean.class.getName());
        System.out.println("int.class.getName() ::: " + int.class.getName());
        System.out.println("char.class.getName() ::: " + char.class.getName());
        System.out.println("long.class.getName() ::: " + long.class.getName());
    }
}