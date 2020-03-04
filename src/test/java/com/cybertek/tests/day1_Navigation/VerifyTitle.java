package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        1.Go to Cybertek practice web URL http://practice.cybertekschool.com/
        2.site and verify expected title :Practice
         */
//connect browser and driver
        //set up driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        driver.manage().window().fullscreen();
        String expectedTitle="Practice";

        String actualTytle=driver.getTitle();

        if(expectedTitle.equals(actualTytle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("I expected "+expectedTitle);
            System.out.println(" and the actual title is "+actualTytle);
        }

        driver.close();


    }
}
