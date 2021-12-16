package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement searchSelenium = driver.findElement(By.name("search"));
        searchSelenium.sendKeys("selenium webdriver");


        WebElement searchsoftware = driver.findElement(By.id("searchButton"));
        searchsoftware.click();

        String getUrl = driver.getCurrentUrl();

        if(getUrl.endsWith("Selenium_(software)")){

            System.out.println("PASS");
        }else{
            System.out.println("FAİL");
        }

        driver.quit();


    }
}
