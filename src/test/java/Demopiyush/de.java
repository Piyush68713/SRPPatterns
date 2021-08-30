package Demopiyush;

import Demopiyush.PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class de extends BaseTest {
    WebDriver driver;
    Demopiyush.PageObjects.HomePage HomePage;

    @BeforeTest
    public void setup() {
        driver = initializeDriver();
        HomePage = new HomePage(driver);
    }

    @Test
    public void Test1() {
        HomePage.goTo();
        String abc = driver.getTitle();
        driver.manage().window().maximize();
        System.out.println("Hello Team The title is " + abc);
        driver.findElement(By.xpath("//div[2]/a[name() = 'a']")).click();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }




























    /*
    public static void main(String[] args) {


        String s = "Piyush";
        String b = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            b = b + s.charAt(i);
        }
        System.out.println(b);
        if (s.equals(b)) {
            System.out.println("This is Pe");
        }

        /************************************************************/

/*
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print("  ");
            }

            System.out.println();
        }



        /************************************************************/
/*
        int x= 0;
        int y= 1;
        int sum=0;
        int i=1;
        while (i<9){
            sum=x+y;
            System.out.println(sum);
            x=y;
            y=sum;
            i++;
        }

    }*/

}