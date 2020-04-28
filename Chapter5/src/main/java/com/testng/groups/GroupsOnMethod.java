package com.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("只是服务端组的测试方法1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("只是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("只是客户端组的测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("只是客户端组的测试方法44444");
    }

    @BeforeGroups("server")
    public void beforeGropsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnserver(){
        System.out.println("这是服务端组运行之后运行的方法！");

    }
}
