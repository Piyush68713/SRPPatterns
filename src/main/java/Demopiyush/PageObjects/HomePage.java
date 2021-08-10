package Demopiyush.PageObjects;

import Demopiyush.AbstractComponents.SearchFlightAvail;
import Demopiyush.AbstractComponents.StrategyFactor;
import Demopiyush.PageComponents.FooterNav;
import Demopiyush.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class HomePage {
    By sectionElement = By.id("traveller-home");
    By footerNavSectionElement = By.id("buttons");
    WebDriver driver;
    SearchFlightAvail searchFlightAvail;

    public HomePage(WebDriver driver) {

        this.driver=driver;

    }

    public void goTo()
    {

        driver.get("https://www.steelcase.com/");
    }

    public NavigationBar getNavigationBar()
    {

        return new NavigationBar(driver,footerNavSectionElement);
    }

    public FooterNav getFooterNav()
    {
        return new FooterNav(driver,sectionElement);
    }

    public void setBookingStrategy(String strategyType)
    {
        StrategyFactor strategyFactor = new StrategyFactor(driver);
        searchFlightAvail = strategyFactor.createStrategy(strategyType);

        this.searchFlightAvail  = searchFlightAvail;
    }

    public void checkAvail(HashMap<String,String> reservationDetails)
    {

        searchFlightAvail.checkAvail(reservationDetails);
    }
    public String getTitle()
    {
        System.out.println("Hello");
        return driver.getTitle();
    }





}
