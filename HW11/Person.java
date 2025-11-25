// ET581 Homework 11 - Student: Bianca Serpe Date 11/25/2025

// Person.java
// This class represents a simple Person with a name and an age.
// We will use this class in streams to filter, map, and group persons.

public class Person {

    // Instance variables (fields) store the state of each Person object
    String name; // stores the person's name
    int age;     // stores the person's age

    // Constructor
    // This method is called when we create a new Person object
    // It initializes the name and age fields with the values passed in
    public Person(String name, int age) {
        this.name = name; // set the name of this person
        this.age = age;   // set the age of this person
    }

    // Getter method for age
    // This allows other classes (like Main.java) to access the age of a Person
    public int getAge() {
        return age; // return the person's age
    }

    // Getter method for name
    // This allows other classes to access the name of a Person
    public String getName() {
        return name; // return the person's name
    }

    // toString method
    // This method is called automatically when we try to print a Person object
    // It defines how the Person will look when printed
    @Override
    public String toString() {
        // Example: "Alice (20)"
        return name + " (" + age + ")";
    }
}
