package com.dj.iot.garden;

//温度计

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Humidifier {
    //湿度
    public  String name;
    public Integer humidity;
}
