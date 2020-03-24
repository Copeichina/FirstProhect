package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonWithCss {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        WebElement todaysDeals=driver.findElement(By.cssSelector("a[tabindex='47']"));
        todaysDeals.click();

        String expected="Today's Deals";
        Thread.sleep(1000);
        WebElement topHeader=driver.findElement(By.cssSelector(".nav-a-content"));

        System.out.println(topHeader.getText());

        if(expected.equals(topHeader.getText())){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected "+expected);
            System.out.println("Actual "+topHeader.getText());
        }


    }
    }

