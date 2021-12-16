package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC3CheckboxVerification {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html");

        WebElement allCondiment = driver.findElement(By.cssSelector("#ex1>fieldset>div"));
       String expectedallCondiment = allCondiment.getText();
       String actualallCondiment = "All condiments";

        Assert.assertEquals(actualallCondiment,expectedallCondiment);

        //Click	to	“All condiments”	button
        allCondiment.click();
        WebElement tomato = driver.findElement(By.cssSelector("#cond2"));
        WebElement lettuce = driver.findElement(By.cssSelector("#cond1"));
        WebElement mustard = driver.findElement(By.cssSelector("#cond3"));
        WebElement sprouts = driver.findElement(By.cssSelector("#cond4"));

        System.out.println("lettuce.isSelected() = " + lettuce.isSelected());
        System.out.println("tomato.isSelected() = " + tomato.isSelected());
        System.out.println("mustard.isSelected() = " + mustard.isSelected());
        System.out.println("sprouts.isSelected() = " + sprouts.isSelected());

        Assert.assertTrue(lettuce.isSelected());
        Assert.assertTrue(tomato.isSelected());
        Assert.assertTrue(mustard.isSelected());
        Assert.assertTrue(sprouts.isSelected());




    }
}
