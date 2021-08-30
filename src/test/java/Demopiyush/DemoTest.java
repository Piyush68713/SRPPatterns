package Demopiyush;

import Demopiyush.PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class DemoTest extends BaseTest {
    WebDriver driver;
    HomePage HomePage;

    @BeforeTest
    public void setup() {
        driver = initializeDriver();
        HomePage = new HomePage(driver);
    }


    @Test(dataProvider = "getData")
    public void Test(HashMap<String, String> reservationDetails) {

        HomePage.goTo();
        // System.out.println("Hello Team Today 08/11");
        // driver.findElement(By.xpath("//*[@id=\"nav-container\"]/div[3]/div/div/ul[2]/li[2]/a")).click();
        //System.out.println(travelHomePage.getFooterNav().getFlightAttribute());
        //System.out.println(travelHomePage.getNavigationBar().getFlightAttribute());
        //System.out.println(travelHomePage.getFooterNav().getLinkCount());
        //System.out.println(travelHomePage.getNavigationBar().getLinkCount());
        //travelHomePage.setBookingStrategy("multitrip");

        // travelHomePage.checkAvail(reservationDetails);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @DataProvider
    //hashmaps,dataprovider, json, jackson,list
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> l = getJsonData(System.getProperty("user.dir") + "//src//test//java//Demopiyush//DataLoads//reservationDetails.json");

        return new Object[][]
                {
                        {l.get(0)}, {l.get(1)}
                };
    }


}
