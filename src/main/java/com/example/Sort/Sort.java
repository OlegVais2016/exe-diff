package com.example.Sort;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        /*Stream<Person> personStream = Stream.of(new Person(11,"Tom"),
        new Person(22,"Bob"),
        new Person(45, "lora"),
        new Person(33,"Pol"));*/
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(11,"Tom"));
        persons.add(new Person(22,"Bod"));
        persons.add(new Person(33,"Art"));
        persons.add(new Person(44,"Dina"));

        persons.stream().sorted(new PersonComparator())
                .forEach(p->System.out.printf("%d  - %s \n",
                         p.getAge(), p.getName()));

    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person{
    private int age;
    private String name;

}

class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}