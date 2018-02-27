package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    private Addition addition=new Addition();

    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void testTheMainMethod(){
        String[] str={"12","13"};
//        Assert.assertTrue(Addition.main(str));
    }

    @Test
    public void testTheSumWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(addition.sum(10,20),30);
        Assert.assertEquals(addition.sum(10,20),31);
    }


}
