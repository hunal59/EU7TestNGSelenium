package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC2SeleniumEasyCheckboxVerificationSection1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html");

        WebElement tomatoChecbox = driver.findElement(By.cssSelector("#cond2"));
        tomatoChecbox.click();

        System.out.println("tomatoChecbox.isSelected() = " + tomatoChecbox.isSelected());
        Assert.assertFalse(tomatoChecbox.isSelected(),"is NOT display");

        tomatoChecbox.click();

        Assert.assertTrue(tomatoChecbox.isSelected(),"is display");

        driver.quit();


    }




}
