package ru.ssau.tk.blashbanoba.practice;

public class MyArray {

    public static int[] setSizeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
