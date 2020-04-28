package com.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("before suite  运行了");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("befere test 运行了");
    }


    @AfterTest
    public  void afterTest(){
        System.out.println("after test 运行成功了");
    }




}
