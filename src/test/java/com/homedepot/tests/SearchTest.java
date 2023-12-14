package com.homedepot.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void searchBarTest() {
        // search for an item (like a chair)

        // wait until item is visible

        // click an option from the search result

        // verify items page is loaded (like a page that displays all the chairs)
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
