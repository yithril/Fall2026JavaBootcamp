package org.example;

//Encapsulation
//Classes as blueprints
public class Person {
    //one way to encapsulate data is to use the private keyword
    private String name;
    private String nationality;

    public Person(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
