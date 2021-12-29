package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class checkBoxHW3 {
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

        Thread.sleep(1000);

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

        Thread.sleep(1000);

        //4.

        WebElement uncheckbutton = driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));
        uncheckbutton.click();

        Thread.sleep(1000);

         one = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
         two = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
         three = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl04_OrderSelector"));
         four = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$orderGrid$ctl05$OrderSelector']"));
         five = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector"));
         six = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl07_OrderSelector"));
         seven = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector"));
         eight = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl09_OrderSelector"));

        Assert.assertFalse(one.isSelected());
        Assert.assertFalse(two.isSelected());
        Assert.assertFalse(three.isSelected());
        Assert.assertFalse(four.isSelected());
        Assert.assertFalse(five.isSelected());
        Assert.assertFalse(six.isSelected());
        Assert.assertFalse(seven.isSelected());
        Assert.assertFalse(eight.isSelected());

        Thread.sleep(1000);


        //5

        String expectedText = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]")).getText();

        System.out.println("expectedText = " + expectedText);
        Thread.sleep(1000);

        one.click();

        Thread.sleep(1000);

        WebElement deletebutton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deletebutton.click();

        Thread.sleep(1000);


        WebElement newButton1= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]"));//6 to verify
        String actualText= newButton1.getText(); //6 to verify
        System.out.println("actualText = " + actualText);

        Assert.assertFalse(actualText.equals(expectedText)); //6

        driver.quit();


    }
}
