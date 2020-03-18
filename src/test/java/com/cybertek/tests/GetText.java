package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // Faker fakeEmail=new Faker();


        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("abg@gmail.com");
        WebElement submitBttn= driver.findElement(By.id("form_submit"));
        submitBttn.submit();

        String expectedText="Your e-mail's been sent!";

        String actualText=driver.findElement(By.name("confirmation_message")).getText();

        if(expectedText.equals(actualText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedText);
            System.out.println("Actual "+actualText);
        }
        driver.close();
    }
}
