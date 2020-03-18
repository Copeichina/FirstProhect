package com.cybertek.tests.day4_xpath;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickvsSubmit {
    public static void main(String[] args) {
        /*
        Task:
        Click()
        Submit()
        go to forgot password web page http://practice.cybertekschool.com/forgot_password
        enter eny email
        click "retrieve password "bttn
        verify the URL is" http://practice.cybertekschool.com/email_sent"
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

       // Faker fakeEmail=new Faker();


        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("abg@gmail.com");
       WebElement submitBttn= driver.findElement(By.id("form_submit"));
       submitBttn.submit();

       String expectedURL="http://practice.cybertekschool.com/email_sent";
       String actualURL=driver.getCurrentUrl();
       if(expectedURL.equals(actualURL)){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
           System.out.println("Expected "+expectedURL);
           System.out.println("Actual "+actualURL);
       }

       driver.close();

    }
}
