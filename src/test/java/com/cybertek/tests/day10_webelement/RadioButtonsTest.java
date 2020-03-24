package com.cybertek.tests.day10_webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
go to http://practice.cybertekschool.com/
verify that blue is selected
red is not selected
 */
public class RadioButtonsTest {
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
         driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @Test
    public  void  test1(){
        WebElement blue=driver.findElement(By.id("blue"));

        //isSelected-->returns true if element is selected
        System.out.println(blue.isSelected());

        //verify if the button is selected
        Assert.assertTrue(blue.isSelected());
        WebElement red=driver.findElement(By.id("red"));

        //print red is not selected
        System.out.println(red.isSelected());

        //verifyes if the statement is false.If it is false it passes, if it is true it fails
        Assert.assertFalse(red.isSelected());


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
     /*
    go to http://practice.cybertekschool.com/
verify that blue is selected
select red

 */

    @Test
    public void test2(){
        WebElement red=driver.findElement(By.id("red"));
        WebElement blue=driver.findElement(By.id("blue"));
        red.click();
        Assert.assertFalse(blue.isSelected());
        Assert.assertTrue(red.isSelected());

    }

}
