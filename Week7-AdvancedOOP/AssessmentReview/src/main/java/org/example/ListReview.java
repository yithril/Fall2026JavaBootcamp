package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListReview {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Orange");

        //number of elements in a list
        System.out.println(fruits.size());

        //if you want to get an element at a certain index
        String newFruit = fruits.get(0);
        System.out.println(newFruit);

        List<Person> people = new ArrayList<>();

        people.add(new Person("Bob", "USA"));

        Person firstPerson = people.get(0);
        System.out.println(firstPerson.getName());
    }
}
