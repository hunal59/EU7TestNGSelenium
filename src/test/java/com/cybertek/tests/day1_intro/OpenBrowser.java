package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
    // we have to enter this line every time we want to open chrome
        //hey webdrivermanager, can you make chrome ready for me for automation
        //WebDriverManager.chromedriver().setup();//we don't see anythink in the class

        //this object represent one chrome browser
        //we are creating driver for chrome browser
        //new ChromeDriver() --> this part will pen chrome browser
      //  WebDriver driver = new ChromeDriver();// execute a empty chrome browser

       // driver.get("https://cybertekschool.com");


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://google.com");



    }
}
