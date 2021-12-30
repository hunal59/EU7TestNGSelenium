package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class EU7Homework {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @AfterMethod
    public void tearDown() {
        //Thread.sleep(2000);
        driver.quit();

}

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();
        Thread.sleep(1000);

        WebElement DateOfBirth = driver.findElement(By.xpath("//*[@name='birthday'] "));
        DateOfBirth.sendKeys("wrong_dob");

        Thread.sleep(2000);

        String expectedMessage = "The date of birth is not valid";
        WebElement Message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));
        String ActualMessage = Message.getText();

        Assert.assertEquals(ActualMessage, expectedMessage);

       /* if (expectedMessage.equals(ActualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAİL");

        }*/
    }

    @Test
    public void Test2() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();
        Thread.sleep(1000);

        List<WebElement> CheckBox = driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement each: CheckBox) {
            Assert.assertTrue(each.isDisplayed());
        }

       /* WebElement Cplus = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        System.out.println("Cplus.isDisplayed() = " + Cplus.isDisplayed());
        Assert.assertTrue(Cplus.isDisplayed());

        Thread.sleep(1000);
        WebElement java = driver.findElement(By.cssSelector("#inlineCheckbox2"));
        System.out.println("java.isDisplayed() = " + java.isDisplayed());
        Assert.assertTrue(java.isDisplayed());

        Thread.sleep(1000);
        WebElement javaScript = driver.findElement(By.cssSelector("#inlineCheckbox3"));
        System.out.println("javaScript.isDisplayed() = " + javaScript.isDisplayed());
        Assert.assertTrue(javaScript.isDisplayed());*/

    }
    @Test
    public void Test3(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();

        WebElement name = driver.findElement(By.cssSelector("input.form-control"));
        name.sendKeys("a");

        String expectedwarning = "first name must be more than 2 and less than 64 characters long";
        WebElement warning = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]"));
        String actualWarning =   warning.getText();

        Assert.assertEquals(actualWarning, expectedwarning);

      /*  if (expectedwarning.equals(actualWarning)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAİL");

        }*/

    }
    @Test
    public void Test4(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();

        WebElement lastName = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        lastName.sendKeys("a");

        String expectedwarning = "The last name must be more than 2 and less than 64 characters long";
        WebElement warning = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));
        String actualWarning =   warning.getText();

        Assert.assertEquals(actualWarning, expectedwarning);


    }



}
