package com.cybertek.tests.day12_pop_tabs_alerts_iframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeExample {
    // http://practice.cybertekschool.com/tinymce
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    //  @AfterMethod
    // public void afterTest() {
    //      driver.quit();
    //   }

    @Test
    public void test() {
        driver.get("http://practice.cybertekschool.com/tinymce");
        //we will switch to iframe --> switchTo().frame
        driver.switchTo().frame("mce_0_ifr");
        //TODO switch by id/name
        //WebElement iframe
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("great.Thanks");

//get out from the frame
        //TODO switchTo().defaultContent();--> goes back to first(out) frame
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h3")).getText());

        // TODO switch by webelement
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);

        textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("great.thanks one time");

        //TODO inside you go one by one
        //TODO but when you going back you may back skipping steps
        // but if you need steps you use switchTo().parentFrame()
        driver.switchTo().parentFrame();

        //switch by index
        driver.switchTo().frame(0);
        textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("great.thanks last time");
    }
}