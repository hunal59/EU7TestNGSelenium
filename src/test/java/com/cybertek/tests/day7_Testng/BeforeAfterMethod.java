package com.cybertek.tests.day7_Testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("---BEFORE CLASS----");
        System.out.println("execute one time before the class");
    }

    @Test
    public void test1() {
        System.out.println("First test case");

    }

    @Test
    public void test2() {
        System.out.println("Second test case");
    }

    @Test
    public void test3() {
        System.out.println("Third test case");
    }

        @BeforeMethod
        public void setUp(){
            System.out.println("BEFORE METHOD");
            System.out.println("Webdriver opening browser");
        }

        @AfterMethod
        public void tearDown() {
            System.out.println("AFTER METHOD");
            System.out.println("Closing browser,quit");
        }

        @AfterClass
        public void tearDownClass(){
        System.out.println("---AFTER CLASS---");
        System.out.println("Some Recording Code Here");
    }

    }

