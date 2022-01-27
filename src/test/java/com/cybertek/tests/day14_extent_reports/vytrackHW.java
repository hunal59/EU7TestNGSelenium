package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.*;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class vytrackHW extends TestBase {
    /*
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */
    @Test
    public void test1() {
        extentLogger = report.createTest("Contact Info Verification");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+password);
        extentLogger.info("Login as a Sales Manager");
        loginPage.login(username,password);
        extentLogger.info("Navigate to --> Customers > Contacts");
        new DashboardPage().navigateToModule("Customers","Contacts");

        ContactsPage contactsPage = new ContactsPage();
        extentLogger.info("Click on mbrackstone9@example.com");
        contactsPage.waitUntilLoaderScreenDisappear();
        contactsPage.getContactEmail("mbrackstone9@example.com").click();

        ContactInfoPage contactInfoPage = new ContactInfoPage();

        String expectedFullName = "Mariam Brackstone";
        String actualFullName = contactInfoPage.fullName.getText();










    }
}
