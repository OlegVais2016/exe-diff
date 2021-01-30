package com.example.test;

public class Cat {

}

class Tiger extends Cat{
    Cat cat = new Cat();
    Tiger tiger = new Tiger();
    Cat cat2 = new Tiger();
    Tiger tiger2 = (Tiger) new Cat();
}