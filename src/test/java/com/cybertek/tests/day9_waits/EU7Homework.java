package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import net.bytebuddy.asm.Advice;
//import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
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
import java.util.concurrent.TimeUnit;

public class EU7Homework {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
        for (WebElement each : CheckBox) {
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
    public void Test3() {
          /*
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. Click on “Registration Form”
Step 3. Enter only one alphabetic character into first name input box.
Step 4. Verify that warning message is displayed: “first name must be more than 2 and less than 64 characters long”
         */
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();

        WebElement name = driver.findElement(By.cssSelector("input.form-control"));
        name.sendKeys("a");

        String expectedwarning = "first name must be more than 2 and less than 64 characters long";
        WebElement warning = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]"));
        String actualWarning = warning.getText();

        Assert.assertEquals(actualWarning, expectedwarning);

      /*  if (expectedwarning.equals(actualWarning)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAİL");

        }*/

    }

    @Test
    public void Test4() {
        /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
    Step 2. Click on “Registration Form”
    Step 3. Enter only one alphabetic character into last name input box.
    Step 4. Verify that warning message is displayed:“The last name must be more than 2 and less than 64 characters long”
         */

        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a"));
        element.click();

        WebElement lastName = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        lastName.sendKeys("a");

        String expectedwarning = "The last name must be more than 2 and less than 64 characters long";
        WebElement warning = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));
        String actualWarning = warning.getText();

        Assert.assertEquals(actualWarning, expectedwarning);


    }

    @Test
    public void Test5() throws InterruptedException {
         /*
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. Click on “Registration Form”
Step 3. Enter any valid first name.
Step 4. Enter any valid last name.
Step 5. Enter any valid username.
Step 6. Enter any valid password.
Step 7. Enter any valid phone number.
Step 8. Select gender.
Step 9. Enter any valid date of birth.
Step 10. Select any department.
Step 11. Enter any job title.
Step 12. Select java as a programming language.
Step 13. Click Sign up.
Step 14. Verify that following success message is
displayed: “You've successfully completed registration!”
Note: for using dropdown, please refer to the documentation: https://selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/
Select.html or, please watch short video about drop-downs that is posted on canvas.
         */

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
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void Test6() throws InterruptedException {
         /*
Step 1. Go to "https://www.tempmailaddress.com/"
Step 2. Copy and save email as a string.
Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
Step 4. And click on “Sign Up For Mailing List".
Step 5. Enter any valid name.
Step 6. Enter email from the Step 2.
Step 7. Click Sign Up
Step 8. Verify that following message is displayed:“Thank you for signing up. Click the button below to return to the home page.”
Step 9. Navigate back to the “https://www.tempmailaddress.com/”
Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
Step 11. Click on that email to open it.
Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”
         */
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

        WebElement fromemail = driver.findElement(By.xpath("//*[@id=\"odesilatel\"]"));//12
        String ActualEmail2 = fromemail.getText();
        String ExpectedEmail2 = "do-not-reply@practice.cybertekschool.com";

        WebElement Subject = driver.findElement(By.xpath("//*[@id=\"predmet\"]"));//13
        String ActualSubject = Subject.getText();
        String ExpectedSubject = "Thanks for subscribing to practice.cybertekschool.com!";
        Assert.assertEquals(ExpectedSubject, ActualSubject);

    }

    @Test
    public void test7() throws InterruptedException {
        /*
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “File Upload".
Step 3. Upload any file with .txt extension from your
computer.
Step 4. Click “Upload” button.
Step 5. Verify that subject is: “File Uploaded!”
Step 6. Verify that uploaded file name is displayed
 */
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("File Upload")).click();//2
        WebElement chosenFile = driver.findElement(By.id("file-upload"));//3
        chosenFile.sendKeys("C:\\Users\\İnci\\Desktop\\file.txt");//3
        Thread.sleep(1000);
        driver.findElement(By.id("file-submit")).click();//4
        String actual = driver.findElement(By.cssSelector("div[class='example']>h3")).getText();
        Assert.assertEquals(actual, "File Uploaded!");//5

        String fileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(fileName, "file.txt");

    }

    @Test
    public void test8() {
          /*
Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
Step 2. And click on “Autocomplete”.
Step 3. Enter “United States of America” into country input box.
Step 4. Verify that following message is displayed:“You selected: United States of America"
     */
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement AutoComplete = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a"));
        AutoComplete.click();
        WebElement countryBox = driver.findElement(By.xpath("//*[@id=\"myCountry\"]"));
        countryBox.sendKeys("United States of America");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/input"));
        submitButton.click();

        String actualMessage = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        String expectedMessage = "You selected: United States of America";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void test9() {
        driver.get("https://practice-cybertekschool.herokuapp.com");

        String[] statusCodes = {"200", "301", "404", "500"};

        for (int i = 0; i < statusCodes.length; i++) {
            driver.findElement(By.linkText(statusCodes[i])).click();

            String text = driver.findElement(By.xpath("//div[@class='example']//p")).getText();

            String[] arr = text.split("\n");
            Assert.assertTrue(arr[0].contains("This page returned a " + statusCodes[i] + " status code."));

            driver.navigate().back();
        }

    }
}



