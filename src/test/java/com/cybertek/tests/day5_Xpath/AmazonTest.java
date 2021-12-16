package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.session.EdgeFilter;

public class AmazonTest {
    public static void main(String[] args) {

        /*go to amazon
        search for selenium
        click search button
        verify 1-48 of 193 results for "selenium"

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String resultText = result.getText();
        System.out.println("resultText = " + resultText);

        String expectedResult = "1-48 of 193 results for";

        if(expectedResult.equals(resultText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİL");
        }
        driver.close();

    }
}
