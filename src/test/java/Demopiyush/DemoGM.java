package Demopiyush;

import Demopiyush.PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class DemoGM extends BaseTest {
    WebDriver driver;
    HomePage travelHomePage;
    @BeforeTest
    public void setup()
    {
        driver =initializeDriver();
        travelHomePage = new HomePage(driver);
    }

}
