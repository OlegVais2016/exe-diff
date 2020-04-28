package com.example.test4;

public class B extends A {
    public String toString() {
        return super.toString() + getClass().getSimpleName();
    }
}
