package officeHours.Selenium_Implicit_Explicit;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitPractice extends TestBase {
    /*
    Implicit wait- set it 1 time and it will work for every findElement method
        -NoSuchElementException

        Thread.sleep-not a Selenium wait, Thread-java class, sleep() method of Thread class
             stops the execution of java progtram
             -We never want to use this method in our test

     Explicit wait-we have to declare every time before the iteraction with element
     Expected Condition we are looking for

     Singelton - it helps us to make sure we have only 1 instance of driver

     */
    /*
    http://qa3.vytrack.com
salesmanager110
UserUser123
     */

    @Test
    public void test(){
       driver.get("http://qa3.vytrack.com");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.titleIs("Login"));


        WebElement username=driver.findElement(By.id("prependedInput"));
        WebElement password=driver.findElement(By.id("prependedInput2"));
        WebElement submit=driver.findElement(By.id("_submit"));

        username.sendKeys("salesmanager110");
        password.sendKeys("UserUser123");
        submit.click();

        WebElement accounts=driver.findElement(By.xpath("//span[.='Accounts']/following-sibling::span/following-sibling::a"));
        accounts.click();
    }
}
