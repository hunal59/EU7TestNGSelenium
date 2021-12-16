package com.cybertek.tests.day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink.getText());

        WebElement forgetPassword = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
        System.out.println(forgetPassword.getText());

        WebElement emailText = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label"));
        System.out.println(emailText.getText());

        WebElement emailInputBox = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/input"));
        emailInputBox.sendKeys("mike@smith.com");

        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println(retrievePassword.getText());

        driver.quit();


    }
}
