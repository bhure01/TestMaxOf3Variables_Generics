package com.bridgelabz.generics;

public class FindMaximum {
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

    public static void main(String[] args) {
        System.out.println("Maximum of 3 integers is : "+maxInteger(10,20,30));
    }
}
