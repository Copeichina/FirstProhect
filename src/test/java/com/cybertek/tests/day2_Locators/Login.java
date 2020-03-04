package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    /*
    1.go to VyTrack login page
    2.write username data:storemanager52
    3.write password  UserUser123
    4.click login button
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();
        //enter username in username bar
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        //enter password in password bar
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        //click login button
        driver.findElement(By.id("_submit")).submit();//or we can use click()

    }
}
