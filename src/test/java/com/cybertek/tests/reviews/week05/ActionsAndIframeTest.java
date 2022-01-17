package com.cybertek.tests.reviews.week05;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ActionsAndIframeTest {
//1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
//2. Switch to iframe.
//3. Double click on the text “Double-click me to change my text color.”
//4. Assert: Text’s “style” attribute value contains “red”.

        WebDriver driver;
        @BeforeMethod
        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        }

        @AfterMethod
        public void tearDown(){
            driver.close();
        }
    }


