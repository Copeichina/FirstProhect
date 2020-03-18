package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        //absolute xpath
       WebElement usernameBox= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input"));
       usernameBox.sendKeys("tom");
       //relative xpath
        //tagname[@attribute='value']
        //*[@id="login"]/div[1]/div/input
        driver.findElement(By.xpath("//input[@type='text']"));

    }
}
