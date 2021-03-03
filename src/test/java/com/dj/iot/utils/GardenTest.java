package com.dj.iot.utils;


import junit.framework.TestCase;


import java.io.IOException;



public class GardenTest extends TestCase {

    public void testGarden() throws IOException {

        RunUtils.exec("./case/garden.iot",true);
    }
}