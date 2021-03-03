package com.dj.iot.utils;

import com.dj.iot.garden.Device;
import junit.framework.TestCase;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GardenTest extends TestCase {

    public void testGarden() throws IOException {

//        RunUtils.exec("./case/garden.iot",true);

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        List<String> item2 =
                Arrays.asList("apple", "apple");

        var res=items.stream().filter(item2::contains)
                .collect(Collectors.toMap(e->e, String::length));

        System.out.println(res);
    }
}