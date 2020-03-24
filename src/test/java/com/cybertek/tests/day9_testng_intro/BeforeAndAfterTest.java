package com.cybertek.tests.day9_testng_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BEFORE METHOD");
    }
    @AfterMethod
    public void test5(){
        System.out.println("After method");
    }

    @Test
    public void test1(){
        System.out.println("this is test one");
        Assert.assertEquals(true,false);
    }
    @Test
    public void test2(){
        System.out.println("this is test one");
    }
}
