package org.example;

public class ArrayAndClass {
    public static void main(String[] args) {
        //Can we have arrays with objects? YES!
        Person[] classPeople = {
                new Person("Bob", true),
                new Person("Joe", false),
                new Person("Marge", true)
        };

        //don't forget, you're dealing with an object!
        System.out.println(classPeople[0].getName());

        //enhanced for loop to loop through our array of People
        for(Person person : classPeople){
            System.out.println(person.getName());
        }
    }
}
