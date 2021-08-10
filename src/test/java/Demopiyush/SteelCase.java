package Demopiyush;

import Demopiyush.PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SteelCase extends BaseTest {
    WebDriver driver;
    HomePage travelHomePage;
    @BeforeTest
    public void setup()
    {
        driver =initializeDriver();
        travelHomePage = new HomePage(driver);
    }
    @Test
    public void SteelCase() {
        travelHomePage.goTo();
        driver.manage().window().maximize();
        System.out.println("Hello");
        System.out.println("Hello Steelcase Team");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Desk");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/form[1]/button[1]/span[2]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)", "");
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }


}
