package com.example.exe_diff;

import java.util.HashMap;
import java.util.Map;

public class Program5 {

    public static void main(String[] args) {
        HashMap<Employee,String> hm = new HashMap<Employee,String>();
        hm.put(new Employee("a"),"emp1");
        hm.put(new Employee("b"),"emp2");
        hm.put(new Employee("a"),"emp1 OVERRIDDEN");

        System.out.println(hm.size());
        System.out.println(hm.get(new Employee("a")));
    }

}


class Employee{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        return true;

    }
}