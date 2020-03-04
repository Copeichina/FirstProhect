package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        //I want to see the full window
        driver.manage().window().fullscreen();
       // driver.manage().window().maximize(); also maximizes the window
        String practiceWebURL="http://practice.cybertekschool.com/";
        driver.get(practiceWebURL);

        Thread.sleep(3000);

        //go to google
        String googleURL="https://www.google.com/";
        driver.navigate().to(googleURL);

        //back to practice site
        driver.navigate().back();

        //now go forward to google again
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //close driver automatically->close just current page
        driver.close();

        //driver.quit();-> close all tabs from web page
    }
}
