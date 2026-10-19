package org.example;

public class Person {
    private String name;
    private boolean isPresent;

    public Person(String name, boolean isPresent) {
        this.name = name;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
