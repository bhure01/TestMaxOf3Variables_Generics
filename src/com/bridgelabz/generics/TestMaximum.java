package com.bridgelabz.generics;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    // UC1- testing maximum value of 3 integers
    @Test
    public void maximumNumberInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(10,20,30);
        Assert.assertEquals(30,maxNumInteger.intValue());
    }
    // UC2- testing maximum value of 3 floats
    @Test
    public void maximumNumberFloat(){
        FindMaximum maxNumber = new FindMaximum();
        Float maxNumFloat = maxNumber.maxFloat(10.10f,20.20f,30.30f);
        Assert.assertEquals(30,maxNumFloat.intValue());
    }
}
