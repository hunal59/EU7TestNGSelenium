package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatOptionsTests extends TestBase {

    /** VERİFY RADİO BUTTONS
     * open browser
     * login as driver
     * go to Activities-> Calender events
     * click on create calender events
     * click on repeat
     * verify that repeat every days is checked
     * verify that repeat weekday is not checked
     */
    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calender Events ");

        CalendarEventsPage calenderEventsPage = new CalendarEventsPage();

        calenderEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(calenderEventsPage.createCalendarEvent,5);
        calenderEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createcalenderEventsPage = new CreateCalendarEventsPage();
        createcalenderEventsPage.repeat.click();
        Assert.assertTrue(createcalenderEventsPage.days.isSelected(),"verify repeat days is selected");

        Assert.assertFalse(createcalenderEventsPage.weekday.isSelected(),"weekday is not selected");


    }

}
