package ru.ssau.tk.blashbanoba.practice;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

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
            result[0] = (-b - sqrt(D)) / (2 * a);
            result[1] = (-b + sqrt(D)) / (2 * a);
            return result;
        }
        if (a == 0) {
            double[] result = new double[1];
            result[0] = -c / b;
            return result;
        }
        return new double[0];
    }

    public int[] arrayNaturalNumbers(int n) {
        int[] numbersArray = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            numbersArray[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return numbersArray;
    }

    public double[] getArithmeticProgression(int n, double a1, double q) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + q;
        }
        return array;
    }

    public double[] getGeometricProgression(int n, double b1, double q) {
        double[] array = new double[n];
        array[0] = b1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * q;
        }
        return array;
    }

    public int[] getArrayDivisors(int c) {
        int count = 0;
        for (int i= 1; i<= (int) sqrt(abs(c)); i++) {
            if(abs(c)%i==0){
                count+=1;
            }
        }
        count = 2 * count - (sqrt(abs(c)) == (int) sqrt(abs(c)) ? 1 : 0);
        count *= 2;
        int[] arrayDivisors = new int[count];
        for (int j = 0, k = 0; j != (int) sqrt(abs(c)); j++) {
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = j + 1;
                arrayDivisors[count - 1 - k] = abs(c) / (j + 1);
                k += 1;
            }
            if (abs(c) % (j + 1) == 0) {
                arrayDivisors[k] = -(j + 1);
                arrayDivisors[count - 1 - k] = -(abs(c) / (j + 1));
                k += 1;
            }
        }
        return arrayDivisors;
    }
}
