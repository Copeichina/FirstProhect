package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button=driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());

        WebElement buttonHome=driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(buttonHome.getText());

        WebElement button2=driver.findElement(By.cssSelector(".col-4.col-md-4"));
        System.out.println(button2.getText());
        //find element by tag name
        WebElement button3=driver.findElement(By.cssSelector("h4"));
        System.out.println(button3.getText());
        //absolute css same as xpatb but we use> instead of /
        WebElement button4=driver.findElement(By.cssSelector("html>body>nav>ul>li>a"));
        System.out.println(button4.getText());
        //Single attribute Find button element that has attribute onclick witk exact text value button1()
        WebElement button5=driver.findElement(By.cssSelector("[onclick='button1()']"));
        System.out.println(button5.getText());
        //css starts with formula
        WebElement button6=driver.findElement(By.cssSelector("button[id^='button_']"));
        System.out.println(button6.getText());
}
}
