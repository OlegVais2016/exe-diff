package com.example.exe_diff;

public class Student {
     private int id;




    public Student(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Student object1 = new Student(5);
        Student object2 = new Student(5);
        if(object1.equals(object2)){
            System.out.println("true-true");
        }else{
            System.out.println("false-false");
        }
    }

}
