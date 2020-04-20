package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic obj = new Arithmetic(1,2,3);

    @Test
    public void checkFirstExpression(){
        Assert.assertEquals(7,obj.computeFirstExpression());
    }
}