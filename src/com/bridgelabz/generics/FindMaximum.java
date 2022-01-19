package com.bridgelabz.generics;


public class FindMaximum <T extends Comparable<T>>{
    T a,b,c;
    // parameterized Constructor to handle different type of values
    FindMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Check max value out of the given 3 Integer values
    public T compareTo() {

        if(a.compareTo(b) > 0) {
            return a;
        } else if(c.compareTo(b) > 0) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // created Generic Integer Object to compare an Integer values
        FindMaximum<Integer> maxIntCompare = new FindMaximum<>(10,20,30);
        System.out.println("Maximum value out of the given 3 Integer values is : "+maxIntCompare.compareTo());
        // created Generic Float Object to compare FLoat values
        FindMaximum<Float> maxFloatCompare = new FindMaximum<>(10.10f,20.20f,30.30f);
        System.out.println("Maximum value out of the given 3 Float values is : "+maxFloatCompare.compareTo());
        // created Generic String Object to compare String values
        FindMaximum<String> maxStringCompare = new FindMaximum<>("abc","xyz","mno");
        System.out.println("Maximum value out of the given 3 String values is : "+maxStringCompare.compareTo());
    }
}
