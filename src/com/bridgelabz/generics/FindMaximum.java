package com.bridgelabz.generics;


public class FindMaximum {

    // UC1- finding maximum value of 3 integers
    public static <T extends Comparable<T>> T maxInteger(T a, T b, T c) {

        if (a.compareTo(b) > 0) {
            return a;
        } else if (c.compareTo(b) > 0) {
            return c;
        } else {
            return b;
        }
    }

    // UC2- finding maximum value of 3 floats
    public static <T extends Comparable<T>> T maxFloat(T A, T B, T C) {

        if (A.compareTo(B) > 0) {
            return A;
        } else if (C.compareTo(B) > 0) {
            return C;
        } else {
            return B;
        }
    }

    // UC3- finding maximum value of 3 strings
    public static <T extends Comparable<T>> T maxString(T str1, T str2, T str3) {

        if (str1.compareTo(str2) > 0) {
            return str1;
        } else if (str3.compareTo(str2) > 0) {
            return str3;
        } else {
            return str2;
        }
    }

    public static void main(String[] args) {

        FindMaximum maxIntCompare = new FindMaximum();
        System.out.println("Maximum of 3 Integers is : " + maxIntCompare.maxInteger(10, 20, 30));

        FindMaximum maxFloatCompare = new FindMaximum();
        System.out.println("Maximum of 3 Floats is : " + maxFloatCompare.maxFloat(10.10f, 20.20f, 30.30f));

        FindMaximum maxStringCompare = new FindMaximum();
        System.out.println("Maximum of 3 Strings is : " + maxStringCompare.maxString("abc", "xyz", "mno"));

    }
}



