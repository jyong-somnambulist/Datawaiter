package com.datawaiter.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CityModel {
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;

}
