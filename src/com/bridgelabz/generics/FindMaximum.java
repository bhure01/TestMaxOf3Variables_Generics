package com.bridgelabz.generics;

public class FindMaximum {

    // UC1- finding maximum value of 3 integers
    public static Integer maxInteger(Integer a,Integer b,Integer c) {

        if(a.compareTo(b) > 0) {
            return a;
        }
        else if( c.compareTo(b) > 0){
            return c;
        }
        else {
            return b;
        }
    }

    // UC2- finding maximum value of 3 floats
    public static Float maxFloat(Float A,Float B,Float C) {

        if(A.compareTo(B) > 0) {
            return A;
        }
        else if( C.compareTo(B) > 0){
            return C;
        }
        else {
            return B;
        }
    }


    public static void main(String[] args) {
        System.out.println("Maximum of 3 Integers is : "+maxInteger(10,20,30));
        System.out.println("Maximum of 3 Floats is : "+maxFloat(10.10f, 20.20f,30.30f));
    }
}
