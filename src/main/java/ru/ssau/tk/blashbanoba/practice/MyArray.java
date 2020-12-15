package ru.ssau.tk.blashbanoba.practice;

import java.util.LinkedList;

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
        for (int i = 1; i <= (int) sqrt(abs(c)); i++) {
            if (abs(c) % i == 0) {
                count += 1;
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

    public LinkedList<Integer> arraySimpleNumbers(int c) {
        if (c < 2) return new LinkedList<>();
        LinkedList<Integer> primes = new LinkedList<>();
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 2; i <= c; i++) {
            nums.add(i);
        }
        while (nums.size() > 0) {
            int nextPrime = nums.remove();
            for (int i = nextPrime * nextPrime; i <= c; i += nextPrime) {
                nums.removeFirstOccurrence(i);
            }
            primes.add(nextPrime);
        }
        return primes;
    }

    public int[] symmetricArray(int n) {
        int[] symmetric = new int[n];
        if (n % 2 != 0) {
            for (int i = 0; i <= (n / 2); i++) {
                symmetric[i] = i + 1;
            }
            int k = (n / 2) + 1;
            for (int j = n / 2 + 1; j < n; j++) {
                symmetric[j] = k - 1;
                k--;
            }
            return symmetric;
        }
        {
            for (int i = 0; i < (n / 2); i++) {
                symmetric[i] = i + 1;
            }
            int k = (n / 2);
            for (int j = n / 2; j < n; j++) {
                symmetric[j] = k;
                k--;
            }
            return symmetric;
        }
    }

    static void changeSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
    }

    static boolean findNumberInArray(int[] array, int n) {
        for (int j : array) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    static boolean checkNull(Integer[] array) {
        for (Integer integer : array) {
            if (integer == null) {
                return true;
            }
        }
        return false;
    }

    public int countEvenNumbers(int[] numbers) {
        int k = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public Integer findMax(int[] array) {
        if (array.length > 0) {
            int maxValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
            return maxValue;
        }
        return null;
    }

    public int sumOfEvenIndex(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }

    static boolean findMoreDivisors(int[] values) {
        int k1 = 0;
        int k2 = 0;
        for (int value : values) {
            if (values[0] % value == 0) {
                k1++;
            }
            if (values[values.length - 1] % value == 0) {
                k2++;
            }
        }
        return k1 > k2;
    }

    public int findMostCommonElement(int[] numbers) {
        int num = numbers[0];
        int maxCommon = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int common = 1;
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] == numbers[k]) {
                    common += 1;
                }
                if (common > maxCommon) {
                    maxCommon = common;
                    num = numbers[i];
                    return numbers[i];
                }
            }
        }
        return 0;
    }

    static int findIndexOfNumber(int[] values, int c) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == c) {
                return i;
            }
        }
        return 0;
    }

    static void exchangedMaxAndMin(int[] array) {
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
    }

    static void bitwiseNOT(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
}
