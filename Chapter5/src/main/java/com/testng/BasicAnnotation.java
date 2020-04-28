package com.testng;

import org.testng.annotations.*;

public class BasicAnnotation {


  @Test
    public void testcase1(){
      System.out.println("Test这是测试用例1");
    }

    @Test
    public void testcase2(){
      System.out.println("Test这个是测试用例2");
    }


    @BeforeMethod
    public void beforeMethod(){
      System.out.println("BeforeMethod 这是在测试方法之前运行的");
    }

    @AfterMethod
   public void afterMethod(){
      System.out.println("afterMethod 这个是在测试方法之后运行的");
    }

    @BeforeClass
   public void beforeclass(){
      System.out.println("beforeclass 这是在类之前运行");
    }

    @AfterClass
  public void afterclass(){
      System.out.println("afterclass 这是在类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
      System.out.println("这一个测试beforeSuite");

    }

    @AfterSuite
    public void afterSuite(){
      System.out.println("这是测试套件afterSuite");
    }
}
