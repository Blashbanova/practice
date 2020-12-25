package ru.ssau.tk.blashbanoba.practice;

public class MyString {

    public void outputLine(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void getArrayOfBytes(String str) {
        byte[] bytesValue = str.getBytes();
        for (int bytes : bytesValue) {
            System.out.println(bytes);
        }
    }

    public void sameStrings() {
        String s1 = "A";
        String s2 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public boolean isPalindrome(String str) {
        String palindrome = new StringBuilder(str).reverse().toString();
        return str.equals(palindrome);
    }

    public boolean isSameRegister(String strFirst, String strSecond) {
        return strFirst.equalsIgnoreCase(strSecond) && !strFirst.equals(strSecond);
    }

    public static void main(String[] args) {
        MyString string = new MyString();
        /*
        string.getArrayOfBytes("проверка");
        System.out.println(" ");
        string.getArrayOfBytes("something");

        string.sameStrings();

        System.out.println(string.isPalindrome("121"));*/

        System.out.println(string.isSameRegister("aaa", "Aaa"));
    }
}
