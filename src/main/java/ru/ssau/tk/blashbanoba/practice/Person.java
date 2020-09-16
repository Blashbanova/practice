package ru.ssau.tk.blashbanoba.practice;

public class Person {

    private String firstName;
    private String lastName;
    private int passportld;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportld) {
        this.passportld = passportld;
    }

    public Person(String firstName, String lastName, int passportld) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportld = passportld;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportld() {
        return passportld;
    }

    public void setPassportld(int passportld) {
        this.passportld = passportld;
    }

}
