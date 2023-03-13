package com.example.demo.Model;

public class Person {

    // Variables
    private String first_name;
    private String last_name;

    // Constructors
    public Person() {
    }

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    // Methods
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
