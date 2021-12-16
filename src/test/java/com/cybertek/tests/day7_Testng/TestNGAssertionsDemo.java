package com.cybertek.tests.day7_Testng;

import com.sun.source.tree.AssertTree;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @BeforeMethod
    public void setup() {
        System.out.println("open browser");
    }

    @Test
    public void test1() {

        System.out.println("first assertion");
        Assert.assertEquals("title", "title");

        System.out.println("second assertion");
        Assert.assertEquals("url", "url");
    }

    @Test
    public void test2() {
        Assert.assertEquals("test2", "test2");
    }

    @Test
    public void test3() {
        String expectedTitle = "Cyb";
        String acrualTitle = "Cybertek";

        //if(acrualTitle.startsWith(expectedTitle))

        Assert.assertTrue(acrualTitle.startsWith(expectedTitle), "verify title statrts with Cyb");
    }

    @Test
    public void test4(){
        //verify email containd @ sign

        String email = "Mike@smith.com";

        Assert.assertTrue(email.contains("@"),"verify email contains @");


    }
    @Test
    public void test5(){
        Assert.assertFalse(0>1,"VERİFY THAT 0 İS NOT GREATER THAN 1");

    }
    @Test
    public void test6(){

        Assert.assertNotEquals("one","one");
    }
        @AfterMethod
        public void terdown () {
            System.out.println("close browser");
        }

    }

