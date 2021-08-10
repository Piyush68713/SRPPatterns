package Demopiyush.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Demopiyush.PageComponents.MultiTrip;
import Demopiyush.PageComponents.RoundTrip;


public class StrategyFactor {
    WebDriver driver;
    By sectionElement= By.id("flightSearchContainer");

    public StrategyFactor(WebDriver driver) {
        this.driver = driver;

    }

    public SearchFlightAvail createStrategy(String strategyType)
    {
        if(strategyType.equalsIgnoreCase("multitrip"))
        {
           return new MultiTrip(driver,sectionElement);
        }
        if(strategyType.equalsIgnoreCase("roundtrip"))
        {
            return new RoundTrip(driver,sectionElement);
        }
        return null;
    }
}
