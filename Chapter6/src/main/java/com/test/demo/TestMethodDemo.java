package com.test.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {

    @Test(description = "用例1")
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test(description = "用例2")
    public  void test2(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test(description = "用例3")
    public void test3(){
        Assert.assertEquals(1,1);
    }


    @Test(description = "用例4")
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我们自己的运行时异常");
    }



}
