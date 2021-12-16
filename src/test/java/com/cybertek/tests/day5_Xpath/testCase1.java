package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement writeterm = driver.findElement(By.id("gh-ac"));
        writeterm.sendKeys("car");
        writeterm.click();

        WebElement clickbuttom = driver.findElement(By.id("gh-btn"));
        clickbuttom.click();



        WebElement getnumber = driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]"));

        System.out.println(getnumber.getText());

        driver.quit();
    }
}
