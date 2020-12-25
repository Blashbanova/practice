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

    @Test
    public void testIsSameRegister() {
        assertFalse(string.isSameRegister("111", "111"));
        assertTrue(string.isSameRegister("AAA", "aaa"));
        assertTrue(string.isSameRegister("AaA", "aaA"));
        assertTrue(string.isSameRegister("Aaa", "aaa"));
        assertTrue(string.isSameRegister("bbb", "BBB"));
        assertFalse(string.isSameRegister("AAA", "aa"));
        assertFalse(string.isSameRegister("", "aaa"));
        assertFalse(string.isSameRegister("", ""));
    }
}