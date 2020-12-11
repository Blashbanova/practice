package ru.ssau.tk.blashbanoba.practice;

import org.testng.annotations.Test;

import java.util.LinkedList;

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

    @Test
    public void testGetArithmeticProgression() {
        MyArray array = new MyArray();
        assertEquals(array.getArithmeticProgression(3, 0, 1), new double[]{0, 1, 2});
        assertEquals(array.getArithmeticProgression(5, -5, 3), new double[]{-5, -2, 1, 4, 7});
        assertEquals(array.getArithmeticProgression(2, 6, 4), new double[]{6, 10});
    }

    @Test
    public void testGetGeometricProgression() {
        MyArray array = new MyArray();
        assertEquals(array.getGeometricProgression(3, 1, 2), new double[]{1, 2, 4});
        assertEquals(array.getGeometricProgression(5, 3, 0.5), new double[]{3, 1.5, 0.75, 0.375, 0.1875});
        assertEquals(array.getGeometricProgression(4, -2, -3), new double[]{-2, 6, -18, 54});
    }

    @Test
    public void testGetArrayDivisors() {
        MyArray array = new MyArray();
        assertEquals(array.getArrayDivisors(1), new int[]{-1, -1});
        assertEquals(array.getArrayDivisors(3), new int[]{1, -1, -3, 3});
        assertEquals(array.getArrayDivisors(-7), new int[]{1, -1, -7, 7});
    }

    @Test
    public void testArraySimpleNumbers() {
        MyArray array = new MyArray();
        LinkedList<Integer> checkPrimes = new LinkedList<Integer>();
        checkPrimes.add(2);
        checkPrimes.add(3);
        checkPrimes.add(5);
        assertEquals(array.arraySimpleNumbers(5), checkPrimes);
    }

    @Test
    public void testSymmetricArray() {
        MyArray array = new MyArray();
        assertEquals(array.symmetricArray(7), new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(array.symmetricArray(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(array.symmetricArray(5), new int[]{1, 2, 3, 2, 1});
    }

    @Test
    public void testChangeSign() {
        int[] array = {3, -7, -10};
        MyArray.changeSign(array);
        assertEquals(array[0], -3);
        assertEquals(array[1], 7);
        assertEquals(array[2], 10);
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        assertTrue(MyArray.findNumberInArray(array, 3));
        assertFalse(MyArray.findNumberInArray(array, 7));
        assertFalse(MyArray.findNumberInArray(array, 9));
    }
}

