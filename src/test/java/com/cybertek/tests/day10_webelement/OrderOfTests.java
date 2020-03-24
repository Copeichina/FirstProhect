package com.cybertek.tests.day10_webelement;

import org.testng.annotations.Test;

public class OrderOfTests {
    @Test
    public void login(){
        System.out.println("Opening the browser");
        System.out.println("capturing the title");
    }

    @Test
    public  void assertTitle(){
        System.out.println("verifying the title");
    }

    @Test
    public  void verifyOtherThings(){
        System.out.println("Verifying something else");
    }
}
