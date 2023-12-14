package com.homedepot.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SidePanelTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void sidePanelIsDisplayedWhenClickOnMeIcon() {
        // Just click on `Me` icon on the header

        // wait until the side panel comes out (use Explicit wait)

        // Verify that the side panel showed up
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
