package javaConcept;

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return name + " : " + age;
    }
}

public class ComparableConcept {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people);
        System.out.println("Sorted by age: " + people);
    }
}
