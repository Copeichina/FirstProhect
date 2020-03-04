package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the text box
        /*
        1.find the text box first->findElement()  from WebDriver

         */
       WebElement emailBox= driver.findElement(By.id("okta-signin-username"));
       //type in the web element the text
       emailBox.sendKeys("olga.greencard@gmail.com");

       //write the password in web element
        driver.findElement(By.id("okta-signin-password")).sendKeys("MyPassword26");

    }
}
