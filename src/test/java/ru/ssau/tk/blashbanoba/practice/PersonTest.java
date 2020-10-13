package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void testGetSet() {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("Bella");
        firstPerson.setLastName("Hadid");
        firstPerson.setPassportld(748271);

        secondPerson.setFirstName("Kendall");
        secondPerson.setLastName("Jenner");
        secondPerson.setPassportld(849282);

        assertEquals(firstPerson.getFirstName(), "Bella");
        assertEquals(firstPerson.getLastName(), "Hadid");
        assertEquals(firstPerson.getPassportld(), 748271);

        assertEquals(secondPerson.getFirstName(), "Kendall");
        assertEquals(secondPerson.getLastName(), "Jenner");
        assertEquals(secondPerson.getPassportld(), 849282);
    }
}