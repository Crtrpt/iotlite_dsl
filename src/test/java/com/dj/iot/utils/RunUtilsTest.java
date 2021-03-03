package com.dj.iot.utils;

import junit.framework.TestCase;

import java.io.IOException;

public class RunUtilsTest extends TestCase {

    public void test1() throws IOException {
        RunUtils.exec("./case/"+Thread.currentThread() .getStackTrace()[1].getMethodName()+".iot");
    }

    public void test2() throws IOException {
        RunUtils.exec("./case/"+Thread.currentThread() .getStackTrace()[1].getMethodName()+".iot");
    }

    public void testselect() throws IOException {
        RunUtils.exec("./case/"+Thread.currentThread() .getStackTrace()[1].getMethodName()+".iot");
    }

}