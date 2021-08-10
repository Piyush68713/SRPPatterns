package Demopiyush;

import Demopiyush.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class DemoGM extends BaseTest {
    WebDriver driver;
    TravelHomePage travelHomePage;
    @BeforeTest
    public void setup()
    {
        driver =initializeDriver();
        travelHomePage = new TravelHomePage(driver);
    }

}
