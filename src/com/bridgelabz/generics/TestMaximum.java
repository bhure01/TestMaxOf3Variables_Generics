package com.bridgelabz.generics;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    // UC1- testing maximum value of 3 Integers
    @Test
    public void maximumInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(10,20,30);
        Assert.assertEquals(30,maxNumInteger.intValue());
    }

    // UC2- testing maximum value of 3 Floats
    @Test
    public void maximumFloat(){
        FindMaximum max = new FindMaximum();
        Float maxNumFloat = max.maxFloat(10.10f,20.20f,30.30f);
        Assert.assertEquals(30,maxNumFloat.intValue());
    }

    // UC3- testing maximum value of 3 Strings
    @Test
    public void maximumString(){
        FindMaximum max = new FindMaximum();
        String maxNumString = max.maxString("abc","xyz","mno");
        Assert.assertEquals("xyz",maxNumString);
    }
}
