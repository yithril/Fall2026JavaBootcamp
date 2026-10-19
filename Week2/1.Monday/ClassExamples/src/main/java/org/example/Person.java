package org.example;

public class Person {
    //1. properties
    //properties are variables TIED to a person
    private String eyeColor;
    private int age;
    private float weight;
    private boolean isStudent; //booleans start with IS or HAS typically
    private String name;

    //2. constructor(s)
    //the constructor says what information you MUST HAVE when
    //creating an object of this class.
    public Person(String eyeColor, int age, float weight, boolean isStudent, String name){
        this.eyeColor = eyeColor;
        this.age = age;
        this.weight = weight;
        this.isStudent = isStudent;
        this.name = name;
    }

    //3. getters/setters
    // setters allow you to change information, getters get information
    //We write getter first, then the setter for each property one by one
    public String getEyeColor(){
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setIsStudent(boolean student) {
        isStudent = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//4. custom methods

    //5. overrides
}
