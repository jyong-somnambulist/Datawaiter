package com.jyong.datawaiterspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityModel {

    /**
     *  `ID` int(11) NOT NULL AUTO_INCREMENT,
     *   `Name` char(35) NOT NULL DEFAULT '',
     *   `CountryCode` char(3) NOT NULL DEFAULT '',
     *   `District` char(20) NOT NULL DEFAULT '',
     *   `Population` int(11) NOT NULL DEFAULT '0',
     */
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;

}
