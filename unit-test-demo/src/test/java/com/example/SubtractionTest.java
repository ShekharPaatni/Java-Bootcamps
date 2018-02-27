package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {
    Subtraction subtraction = null;
    @Before
    public void setup() {
        subtraction = new Subtraction();
    }

    @Test
    public void canaryTest() {
        Assert.assertTrue(true);
    }
    @Test
    @Ignore
    public void twoIntItemSubtraction() {
        Assert.assertEquals(subtraction.sub(15, 11), 3);
    }
    @Test
    public  void twoFloatItemSubtraction() {
        Assert.assertEquals(subtraction.sub(15.5f,15.4f), .1F, 0.1 );
    }
}