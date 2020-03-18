package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/secure");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword"+ Keys.ENTER);
        //locating the welcome msg with tag name
        WebElement welcomeMessage=driver.findElement(By.tagName("h4"));

        //can we compare webelement with String?NO
        //We need to convert WebElement to String

        String expectedWelcomeMsg="Welcome to the Secure Area. When you are done click logout below.";
        //getText()-->converts webElement to String
        //take text from html
        String actualM=welcomeMessage.getText();
        if(expectedWelcomeMsg.equals(actualM)){
            System.out.println("Pass");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedWelcomeMsg);
            System.out.println("Actual "+actualM);
        }
        driver.close();

    }
}
