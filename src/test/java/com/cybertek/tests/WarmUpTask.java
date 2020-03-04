package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask {
    /*
    There are 2 warm up tasks, do it before the class:
Task 1:
1. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify the title of the page
Task 2:
2. Go to Bookit login page
https://cybertek-reservation-qa.herokuapp.com/sign-in
2. Verify that URL contains “cybertek-reservation”

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String actualTitle="bookit";
        String expectedTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedTitle);
            System.out.println("Actual "+actualTitle);
        }
        driver.close();



    }
}
