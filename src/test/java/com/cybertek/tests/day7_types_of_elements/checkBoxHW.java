package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class checkBoxHW {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement clickbutton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        clickbutton.click();

        Thread.sleep(1000);

        WebElement checkall = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkall.click();

        Thread.sleep(2000);

        WebElement one = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        WebElement two = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        WebElement three = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl04_OrderSelector"));
        WebElement four = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$orderGrid$ctl05$OrderSelector']"));
        WebElement five = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
        WebElement six = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
        WebElement seven = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
        WebElement eight = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        System.out.println("one.isSelected() = " + one.isSelected());
        System.out.println("two.isSelected() = " + two.isSelected());
        System.out.println("three.isSelected() = " + three.isSelected());
        System.out.println("four.isSelected() = " + four.isSelected());
        System.out.println("five.isSelected() = " + five.isSelected());
        System.out.println("six.isSelected() = " + six.isSelected());
        System.out.println("seven.isSelected() = " + seven.isSelected());
        System.out.println("eight.isSelected() = " + eight.isSelected());

        Thread.sleep(2000);

        //4.

        WebElement uncheckbutton = driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        uncheckbutton.click();

        Thread.sleep(2000);

        //Assert.assertFalse(one.isSelected(),"verify checkbox 1 is NOT selected");


        //5
        three.click();
        //WebElement deletebutton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        //deletebutton.click();




    }
}
