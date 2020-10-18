package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testSetSizeArray() {
        int[] array = MyArray.setSizeArray(10);
        assertEquals(array.length,10, DELTA);
        assertNotEquals(array.length,Double.NaN);
    }
}