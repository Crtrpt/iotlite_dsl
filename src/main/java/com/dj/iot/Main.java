package com.dj.iot;

import com.dj.iot.utils.RunUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RunUtils.exec("./case/garden.iot",true);
    }
}
