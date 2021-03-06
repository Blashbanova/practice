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
        LinkedList<Integer> checkPrimes = new LinkedList<>();
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

    @Test
    public void testCheckNull() {
        Integer[] array = new Integer[]{2, 5, 6, null};
        assertTrue(MyArray.checkNull(array));
        Integer[] arrayOther = new Integer[]{3, 2, 1};
        assertFalse(MyArray.checkNull(arrayOther));
        Integer[] arrayNew = new Integer[]{null, 0, 1, null};
        assertTrue(MyArray.checkNull(arrayNew));
    }

    @Test
    public void testCountEvenNumbers() {
        MyArray array = new MyArray();
        int[] arrayOne = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertEquals(array.countEvenNumbers(arrayOne), 4);
        int[] arrayTwo = new int[]{2, 4, 6, 8, 12, 22, 24, 60, 80};
        assertEquals(array.countEvenNumbers(arrayTwo), 9);
        int[] arrayThree = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 21, 89, 91};
        assertEquals(array.countEvenNumbers(arrayThree), 0);
    }

    @Test
    public void testFindMax() {
        MyArray array = new MyArray();
        int[] checkArray = new int[]{7, 6, 8, 5, 3, 2, 9, 1};
        assertEquals(array.findMax(checkArray), new Integer(9));
        int[] checkTwoArray = new int[]{-7, 6, 87, -5, -3, 2, -4, 1};
        assertEquals(array.findMax(checkTwoArray), new Integer(87));
        int[] checkNewArray = new int[]{};
        assertNull(array.findMax(checkNewArray));
    }

    @Test
    public void testSumOfEvenIndex() {
        MyArray array = new MyArray();
        assertEquals(array.sumOfEvenIndex(new int[]{1, 2, 3, 4, 5, 6, 11}), 20);
        assertEquals(array.sumOfEvenIndex(new int[]{11, 32, 43, -4, 58, -76, 870}), 982);
        assertEquals(array.sumOfEvenIndex(new int[]{-1, 2, -3, 4, -5, 6, -10}), -19);
    }

    @Test
    public void testFindMoreDivisors() {
        int[] numbersOne = {27, 3, 9, 8, 2, 4, 6, 12, 24};
        assertFalse(MyArray.findMoreDivisors(numbersOne));
        int[] numbersTwo = {12, 4, 3, 2, 6, 1, 17, 18, 25};
        assertTrue(MyArray.findMoreDivisors(numbersTwo));
        int[] numbersThree = {27, 3, 9, 8, 6, 12, 24};
        assertFalse(MyArray.findMoreDivisors(numbersThree));
    }

    @Test
    public void testFineMostCommonElement() {
        MyArray check = new MyArray();
        int[] checkNumbers = {1, 1, 1, 2, 3, 3, 3, 4, 7, 6, 5};
        assertEquals(check.findMostCommonElement(checkNumbers), 1);
        int[] checkNumbersTwo = {1, 2, 3, 4, 5, 11, 47, 89, 5, 32, 5, 4};
        assertEquals(check.findMostCommonElement(checkNumbersTwo), 4);
        int[] checkNumbersThree = {0, -2, 3, 0, -5, 0, -4, 6, 0, 6};
        assertEquals(check.findMostCommonElement(checkNumbersThree), 0);
    }

    @Test
    public void testFindIndexOfNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 20};
        assertEquals(MyArray.findIndexOfNumber(array, 5), 4);
        assertEquals(MyArray.findIndexOfNumber(array, 11), 10);
        assertEquals(MyArray.findIndexOfNumber(array, 20), 14);
    }

    @Test
    public void testExchangedMaxAndMin() {
        int[] arrayFirst = {1, 2, 3, 5, 6};
        MyArray.exchangedMaxAndMin(arrayFirst);
        assertEquals(arrayFirst, new int[]{6, 2, 3, 5, 1});
        int[] arraySecond = {9};
        MyArray.exchangedMaxAndMin(arraySecond);
        assertEquals(arraySecond, new int[]{9});
        int[] arrayThird = {0, 0, 2, 0, 7};
        MyArray.exchangedMaxAndMin(arrayThird);
        assertEquals(arrayThird, new int[]{7, 0, 2, 0, 0});
    }

    @Test
    public void testBitwiseNOT() {
        int[] array = {12, 15, 56};
        MyArray.bitwiseNOT(array);
        assertEquals(array, new int[]{-13, -16, -57});
        MyArray.bitwiseNOT(array);
        assertEquals(array, new int[]{12, 15, 56});
        int[] newArray = {-2, 5, -6};
        MyArray.bitwiseNOT(newArray);
        assertEquals(newArray, new int[]{1, -6, 5});
    }

    @Test
    public void testArrayBitwiseNot() {
        int[] yesArray = {7, 16, -9};
        MyArray array = new MyArray();
        assertEquals(array.arrayBitwiseNot(yesArray), new int[]{-8, -17, 8});
        assertEquals(array.arrayBitwiseNot(array.arrayBitwiseNot(yesArray)), new int[]{7, 16, -9});
        int[] yesArrayTwo = {17, -1, 2, 4};
        assertEquals(array.arrayBitwiseNot(yesArrayTwo), new int[]{-18, 0, -3, -5});
    }

    @Test
    public void testSumNextElements() {
        assertEquals(MyArray.sumNextElements(new int[]{10, 20, 30}), new int[]{30, 30});
        assertEquals(MyArray.sumNextElements(new int[]{0, -7, 30}), new int[]{-7, 30});
        assertEquals(MyArray.sumNextElements(new int[]{1, 2, 3, 4, -8, 0, 9}), new int[]{3, 7, -8, 9});
    }

    @Test
    public void testFindEvenNumbers() {
        assertEquals(MyArray.findEvenNumbers(new int[]{1, 2, 3, 4, 5}), new boolean[]{false, true, false, true, false});
        assertEquals(MyArray.findEvenNumbers(new int[]{2, 4, 6, 8, 10}), new boolean[]{true, true, true, true, true});
        assertEquals(MyArray.findEvenNumbers(new int[]{1, 3, 5, 7, 9}), new boolean[]{false, false, false, false, false});
        assertEquals(MyArray.findEvenNumbers(new int[]{-1, 3, -5, 4, 0}), new boolean[]{false, false, false, true, true});
    }

    @Test
    public void testConvertLongToTwoInts() {
        assertEquals(MyArray.convertLongToTwoInts(-2L), new int[]{-1, -2});
        assertEquals(MyArray.convertLongToTwoInts(126L), new int[]{0, 126});
        assertEquals(MyArray.convertLongToTwoInts(1L), new int[]{0, 1});
        assertEquals(MyArray.convertLongToTwoInts(0), new int[]{0, 0});
    }

    @Test
    public void testConvertTwoIntsToLong() {
        assertEquals(MyArray.convertTwoIntsToLong(1, -2), -2);
        assertEquals(MyArray.convertTwoIntsToLong(2, 2), 8589934594L);
        assertEquals(MyArray.convertTwoIntsToLong(0, 1), 1);
    }

    @Test
    public void testGetCycleOfNaturalNumbers() {
        assertEquals(MyArray.getCycleOfNaturalNumbers(5, 3), new int[]{3, 4, 5, 1, 2});
        assertEquals(MyArray.getCycleOfNaturalNumbers(1, 0), new int[]{1});
        assertEquals(MyArray.getCycleOfNaturalNumbers(5, 4), new int[]{2, 3, 4, 5, 1});
        assertEquals(MyArray.getCycleOfNaturalNumbers(7, 6), new int[]{2, 3, 4, 5, 6, 7, 1});
        assertEquals(MyArray.getCycleOfNaturalNumbers(3, 1), new int[]{3, 1, 2});
    }

    @Test
    public void testCreateTwoDimensionalArray() {
        assertEquals(MyArray.createTwoDimensionalArray(3), new int[][]{{1, 2, 3}, {4, 5}, {6}});
        assertEquals(MyArray.createTwoDimensionalArray(2), new int[][]{{1, 2}, {3}});
        assertEquals(MyArray.createTwoDimensionalArray(1), new int[][]{{1}});
        assertEquals(MyArray.createTwoDimensionalArray(5), new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12}, {13, 14}, {15}});
    }

    @Test
    public void testSortWithoutNaN() {
        double[] array = {5.5, 1, 0, 6};
        MyArray.sortWithoutNaN(array);
        assertEquals(array, new double[]{0, 1, 5.5, 6});

        double[] arrayOne = new double[2];
        arrayOne[0] = 1;
        arrayOne[1] = Double.NaN;
        MyArray.sortWithoutNaN(arrayOne);
        assertEquals(arrayOne[0], 1);

        double[] arrayTwo = {1.4, 2.3, 4.5, Double.NaN, 7.9, Double.NaN, 11, Double.NaN, -8};
        MyArray.sortWithoutNaN(arrayTwo);
        assertEquals(arrayTwo, new double[]{1.4, 2.3, 4.5, Double.NaN, 7.9, Double.NaN, 11, Double.NaN, -8});
    }
}