package ru.ssau.tk.blashbanoba.practice;

public class Program {

    public static void main(String[] args) {
        Person Tom = new Person("Tom", "Hardy");
        Person Harry = new Person();
        Person Bella = new Person(758432);
        Person Henry = new Person("Henry", "Cavill", 758721);

        Harry.setFirstName("Harry");
        Harry.setLastName("Potter");
        Harry.setPassportld(957483);

    }
}
