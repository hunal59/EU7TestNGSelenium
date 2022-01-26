package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitlesTest extends TestBase {

    /**
     * Test case
     * Open chrome Browser
     * Login as Driver
     * Verify that page subtitle is Quick Launchpad
     * Go to sctivities -> calender events
     * verify that page subtitle is calender events
     */
    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        String expectedSubtitle = "Quick Launchpad";

        DashboardPage dashboardPage = new DashboardPage();
        String actualSubtitle = dashboardPage.getPageSubTitle();

        Assert.assertEquals(actualSubtitle,expectedSubtitle);

        dashboardPage.navigateToModule("Activities","Calender Events ");

        CalendarEventsPage calenderEventsPage = new CalendarEventsPage();

        BrowserUtils.waitFor(2);
        Assert.assertEquals(calenderEventsPage.getPageSubTitle(),"Calender Events");


    }

}
