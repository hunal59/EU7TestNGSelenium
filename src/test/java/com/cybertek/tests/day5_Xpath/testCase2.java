package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class testCase2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement writeselenium = driver.findElement(By.id("gh-ac"));
        writeselenium.sendKeys("selenium");

        WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        clickButton.click();

        String title =  driver.getTitle().toLowerCase();


        if (title.contains("selenium")){
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
        }

        driver.quit();

    }
}
