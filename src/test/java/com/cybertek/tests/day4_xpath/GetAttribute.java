package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        /*
        locate single bttn from bookit application
        print out retrieve password value
        type="submit"
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement retrieveBttn=driver.findElement(By.id("form_submit"));
        System.out.println(retrieveBttn.getAttribute("type"));//submit
        System.out.println(retrieveBttn.getAttribute("class"));//radius

    }
}
