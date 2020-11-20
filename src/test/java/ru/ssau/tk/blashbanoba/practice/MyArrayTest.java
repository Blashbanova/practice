package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testSetSizeArray() {
        int[] array = MyArray.setSizeArray(10);
        assertEquals(array.length, 10, DELTA);
        assertNotEquals(array.length, Double.NaN);
    }

    @Test
    public void testSetUnitArray() {
        int[] array = MyArray.setUnitArray(10);
        assertEquals(array.length, 10);
        assertNotEquals(array.length, Double.NaN);
        assertEquals(array[0], 2);
        assertEquals(array[9], 2);
        assertEquals(array[5], 1);
    }

    @Test
    public void testSetOddArray() {
        int[] array = MyArray.setOddArray(10);
        assertEquals(array.length, 10);
        assertNotEquals(array.length, Double.NaN);
        assertEquals(array[0], 1);
        assertEquals(array[5], 11);
        assertEquals(array[9], 19);
    }

    @Test
    public void testSetEvenArray() {
        int[] array = MyArray.setEvenArray(10);
        assertEquals(array.length, 10);
        assertNotEquals(array.length, Double.NaN);
        assertEquals(array[0], 20);
        assertEquals(array[9], 2);
    }

    @Test
    public void testSetFibonacciArray() {
        int[] array = MyArray.setFibonacciArray(10);
        assertEquals(array.length, 10);
        assertNotEquals(array.length, Double.NaN);
        assertEquals(array[0], 0);
        assertEquals(array[9], 34);
    }

    @Test
    public void testSetSqrIndex() {
        int[] array = MyArray.setSqrIndex(10);
        assertEquals(array[5], 25);
        assertEquals(array[9], 81);
    }

    @Test
    public void testQuadraticSolutionArray() {
        MyArray array = new MyArray();
        assertEquals(array.quadraticSolutionArray(1, -4, 4), new double[]{2});
        assertEquals(array.quadraticSolutionArray(1, -5, 9), new double[0]);
        assertEquals(array.quadraticSolutionArray(1, 3, -4), new double[]{-4, 1});
        assertEquals(array.quadraticSolutionArray(0, 2, -8), new double[]{4});
    }

    @Test
    public void testArrayNaturalNumbers() {
        MyArray array = new MyArray();
        assertEquals(array.arrayNaturalNumbers(5), new int[]{1, 2, 4, 5, 7});
        assertEquals(array.arrayNaturalNumbers(7), new int[]{1, 2, 4, 5, 7, 8, 10});
        assertEquals(array.arrayNaturalNumbers(9), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13});
    }
}

