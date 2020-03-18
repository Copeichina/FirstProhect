package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args) {
        //create Kaker object

        Faker fakeData=new Faker();
        String name=fakeData.name().firstName();
        System.out.println(name);//we use java faker


        /*
    1. go to login page http://practice.cybertekschool.com/login
    2. enter invalid username
    3. enter invalid password
    4. Verify the error massage "Your username is invalid!"

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        Faker faker=new Faker();
        String password=faker.app().author();

        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys(name);
        driver.findElement(By.name("password")).sendKeys(password+ Keys.ENTER);




    }
}
