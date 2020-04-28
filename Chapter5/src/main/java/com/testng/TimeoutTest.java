package com.testng;

import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(timeOut = 3000)//单位为毫秒
    public void timeoutcase() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 1000)//单位为毫秒
    public void timeoutcase2() throws InterruptedException {
        Thread.sleep(2000);
    }
}
