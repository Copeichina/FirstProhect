package com.cybertek.tests.day9_testng_intro;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest {
    @Test
    public void test1() {
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        System.out.println("test 1 complete ");
    }

    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";

        System.out.println("starting to compare");
        Assert.assertEquals(actual, expected);
        System.out.println("test 2 complete");
    }

    @Test
    public void test3() {
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected, actual);
        Assert.assertNotEquals(1, 2);
        System.out.println("test 3");
    }

    @Test
    public void test4() {
        String expected = "one";
        String actual = "two";
        int e = 100;
        int a = 200;
        Assert.assertTrue(a > e);
    }

    @Test
    public void test5(){
        String expected="https://www.google.com/";
        String actual="https://www.google.com/";
        //verify that url is Equal to https://www.google.com
        String expected1="java";
        String actual1="java - Google Search";
        //verify that title starts with Java

        Assert.assertTrue(actual1.startsWith("djgdji"));
        System.out.println(actual1.startsWith("djgdji"));
    }


}
