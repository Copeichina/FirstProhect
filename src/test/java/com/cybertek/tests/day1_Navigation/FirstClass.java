package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main (String[] args) throws InterruptedException {
//binary the driver and browser
        WebDriverManager.chromedriver().setup();
       //WebDriver object needs to be created-->Interface
//I have a driver now
        WebDriver driver=new ChromeDriver();
//I want to open a Google
        //by using get()--> url as String
        driver.get("https://www.google.com/");

        //Navigation
        //navigate().to()-->open a web page
        driver.navigate().to("https://www.google.com/");

        //the differences between get an navigate method
        //get method will wait util everything is page fully loaded
        //and after that will navigate, but navigate will not wait

        //navigate().back()
        //go to Google and after that to http://practice.cybertekschool.com/
        //in order to came back to Google we use navigate().back()
        driver.get("https://www.google.com/");
        Thread.sleep(3);
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.navigate().back();

        //navigate().forward()
        //go to practice website->google->practice web site->forward to google
        driver.get("https://www.google.com/");
        driver.navigate().to("http://practice.cybertekschool.com/");
        driver.navigate().back();
        driver.navigate().forward();

        //driver.navigate().refresh();<--refreshes the page

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();




    }
}
