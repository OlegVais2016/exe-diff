package com.example.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {
// создаем кота и выводим на экран чтоб убедиться, что он "пустой"
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        System.out.println(myCat);

        // создаем лямбду
        Settable<Cat> s = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };
        Settable<Dog> d = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        // вызываем метод, в который передаем кота и лямбду
        changeEntity(myCat, s);
        changeEntity2(myDog, d);
        // выводим на экран и видим, что состояние кота изменилось (имеет имя и возраст)
        System.out.println(myCat);
        System.out.println(myDog);
    }
    private static <T /*extends WithNameAndAge*/>  void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Мурзик", 3);
    }
    private static <T /*extends WithNameAndAge*/>  void changeEntity2(T entity, Settable<T> d) {
        d.set(entity, "Bursik", 6);
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Cat /*implements WithNameAndAge*/ {
    private String name;
    private int age;
}

//interface WithNameAndAge {
//    void setName(String name);
//    void setAge(int age);
//}
interface Settable<C /*extends WithNameAndAge*/> {
    void set(C entity, String name, int age);
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class Dog /*implements WithNameAndAge*/ {
    private String name;
    private int age;
}