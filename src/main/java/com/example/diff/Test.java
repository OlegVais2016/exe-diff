package com.example.diff;

import java.lang.reflect.Field;

public abstract class Test {
    protected abstract void foo();
}

class MyTest extends Test{

    @Override
     protected final void foo() {

    }
}

class A{
    private String field = "I'm private field";
}

class B{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A a = new A();
        Field f = A.class.getDeclaredField("field");
        f.setAccessible(true);
        String fieldValue = (String)f.get(a);
        System.out.println(fieldValue);
        C c = new C();
        c.setStr("Pol");
        System.out.println(c.getStr());
        
    }
}

class C{
    private String str;
    public C(){};
    public C(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

interface D{
    void foo();
}

interface S extends D{
    @Override
    void foo();
}