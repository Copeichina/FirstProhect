package officeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class IframesPractice {
    /*
    Iframe-Wed document inside of other web document
    another HTLM inside another HTML document

     */
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/nested_frames");
        Thread.sleep(3000);
        driver.switchTo().frame("frame-top");
        List<WebElement> frameList=driver.findElements(By.xpath("//frame"));
        /*
          we have stored all frames webElements inside the list
          1. loop through list
          2.switch to each frame
          a.get text from body
          b.switch to parent
         */
        for (int i=0;i<frameList.size();i++) {
            driver.navigate().refresh();
            Thread.sleep(1000);
            driver.switchTo().frame(i);
            String bodyText=driver.findElement(By.xpath("//body")).getText();
            System.out.println("Body text: "+bodyText);
            driver.switchTo().parentFrame();
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

    }
}
