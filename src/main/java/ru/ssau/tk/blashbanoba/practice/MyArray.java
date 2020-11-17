package ru.ssau.tk.blashbanoba.practice;

public class MyArray {

    public static int[] setSizeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] setUnitArray(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }

    public static int[] setOddArray(int size) {
        int[] array = new int[size];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count = count + 2;
        }
        return array;
    }

    public static int[] setEvenArray(int size) {
        int[] array = new int[size];
        int count = size * 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = count;
            count = count - 2;
        }
        return array;
    }

    public static int[] setFibonacciArray(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static int[] setSqrIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public double[] quadraticSolutionArray(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if ((D == 0) & (a > 0)) {
            double[] result = new double[1];
            result[0] = -b / (2 * a);
            return result;
        }
        if ((D > 0) & (a > 0)) {
            double[] result = new double[2];
            result[0] = (-b - Math.sqrt(D)) / (2 * a);
            result[1] = (-b + Math.sqrt(D)) / (2 * a);
            return result;
        }
        if (a == 0) {
            double[] result = new double[1];
            result[0] = -c / b;
            return result;
        }
        return new double[0];
    }
}
