package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringTest {

    public static MyString string = new MyString();

    @Test
    public void testIsPalindrome() {
        assertTrue(string.isPalindrome("111"));
        assertTrue(string.isPalindrome("000"));
        assertTrue(string.isPalindrome("aba"));
        assertFalse(string.isPalindrome("abc"));
        assertFalse(string.isPalindrome("AbC"));
        assertFalse(string.isPalindrome("Aaa"));
    }
}