package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;



public class checkBoxHW2 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        Thread.sleep(2000);

        List<WebElement> CheckBox = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement each: CheckBox) {
            Assert.assertTrue(each.isSelected());
        }
        System.out.println(CheckBox.size());
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll")).click();

        Thread.sleep(2000);

        CheckBox = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement each: CheckBox) {
            Assert.assertFalse(each.isSelected());
        }
        String expectedText = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]")).getText();

        System.out.println("expectedText = " + expectedText);
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
        Thread.sleep(1000);

        WebElement newButton1= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]"));//6 to verify
        String actualText= newButton1.getText(); //6 to verify
        System.out.println("actualText = " + actualText);

        Assert.assertFalse(actualText.equals(expectedText));

        driver.quit();

    }
}
