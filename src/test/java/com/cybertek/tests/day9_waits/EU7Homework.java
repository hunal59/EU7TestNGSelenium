package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    @Test
    public void Test5() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();

        WebElement name = driver.findElement(By.cssSelector("input.form-control"));
        name.sendKeys("Mike");

        WebElement lastName = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        lastName.sendKeys("Smith");

        WebElement username = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
        username.sendKeys("123456");

        WebElement email = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        email.sendKeys("mike@smith.com");

        WebElement password = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
        password.sendKeys("12345678");

        WebElement phoneNumber = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
        phoneNumber.sendKeys("123-456-0000");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[1]/label/input"));
        gender.click();

        WebElement dateOfBirth = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
        dateOfBirth.sendKeys("01/01/2000");

        WebElement department = driver.findElement(By.name("department"));
        Select departmentOffice = new Select(department);
        departmentOffice.selectByIndex(3);

        WebElement job = driver.findElement(By.name("job_title"));
        Select selectJob = new Select(job);
        selectJob.selectByVisibleText("Manager");

        WebElement language = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        language.click();

        Thread.sleep(2000);
        WebElement signUp = driver.findElement(By.id("wooden_spoon"));
        signUp.click();

        Thread.sleep(3000);
        WebElement message = driver.findElement(By.xpath("//*[@id='content']/div/div/p"));
        String expectedMessage = "You've successfully completed registration!";
        String actualMessage = message.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Test
    public void Test6() throws InterruptedException {
        driver.get("https://www.tempmailaddress.com/");//1

        WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"email\"]"));//2
        String email = emailAddress.getText();

        driver.get("https://practice-cybertekschool.herokuapp.com");//3
        WebElement signUpList = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[43]/a"));
        signUpList.click();//4

        WebElement name = driver.findElement(By.xpath("//*[@name=\"full_name\"]"));
        name.sendKeys("Mike Smith");//5

        WebElement emailAdd = driver.findElement(By.xpath("//*[@name=\"email\"]"));
        emailAdd.sendKeys(email);//6
        
        WebElement signup = driver.findElement(By.xpath("//*[@name=\"wooden_spoon\"]"));
        signup.click();//7
        Thread.sleep(1000);

        WebElement Message = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));//8
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String ActualMessage = Message.getText();
        Assert.assertEquals(expectedMessage, ActualMessage);
        Thread.sleep(1000);

        driver.get("https://www.tempmailaddress.com/");//9
        Thread.sleep(3000);
       WebElement receiveEmail = driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[2]"));
       String ExpectedEmail = "do-not-reply@practice.cybertekschool.com";
       String ActualEmail = receiveEmail.getText();
       Assert.assertEquals(ExpectedEmail, ActualEmail);//10

       receiveEmail.click();//11
       Thread.sleep(1000);

       WebElement fromemail= driver.findElement(By.xpath("//*[@id=\"odesilatel\"]"));//12
       String ActualEmail2 = fromemail.getText();
       String ExpectedEmail2 = "do-not-reply@practice.cybertekschool.com";

       WebElement Subject = driver.findElement(By.xpath("//*[@id=\"predmet\"]"));//13
       String ActualSubject = Subject.getText();
       String ExpectedSubject = "Thanks for subscribing to practice.cybertekschool.com!";
       Assert.assertEquals(ExpectedSubject, ActualSubject);










    }



}
