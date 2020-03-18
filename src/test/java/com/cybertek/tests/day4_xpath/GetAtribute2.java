package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtribute2 {
    public static void main(String[] args) {
        /*
        locate Example1
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
       WebElement linkText= driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        System.out.println(linkText.getAttribute("href"));
    }
}
