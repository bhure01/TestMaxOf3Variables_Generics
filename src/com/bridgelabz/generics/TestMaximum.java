package com.bridgelabz.generics;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void maximumNumberInteger() {
        FindMaximum maxNum = new FindMaximum();
        Integer maxNumInteger = maxNum.maxInteger(10,20,30);
        Assert.assertEquals(30,maxNumInteger.intValue());
    }
}
