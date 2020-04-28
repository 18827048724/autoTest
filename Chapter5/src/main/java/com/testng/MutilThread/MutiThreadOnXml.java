package com.testng.MutilThread;

import org.testng.annotations.Test;

public class MutiThreadOnXml {

    @Test
    public void test1(){
        System.out.print(1);

        System.out.printf("Tread ID : %s%n",Thread.currentThread().getId());

    }
    @Test
    public void test2(){
        System.out.print(2);
        System.out.printf("Tread ID ： %s%n",Thread.currentThread().getId());

    }
    @Test
    public void test3(){
        System.out.print(3);
        System.out.printf("Tread ID ： %s%n",Thread.currentThread().getId());

    }


}
