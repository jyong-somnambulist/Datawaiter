package com.datawaiter.java;


import cn.hutool.core.date.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Launcher {
    public static void main(String[] args) throws ParseException {

        String dt_str="20211105161018900";
        String substring = dt_str.substring(0, 12);
        System.out.println(DateUtil.format(DateUtil.parse(substring,"yyyyMMdd HHmmssSSS"),"yyyy-MM-dd HH:mm:ss"));



        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        format.setTimeZone(TimeZone.getDefault());
        Date parse = format.parse(dt_str);
        System.out.println(parse.toString());
        String format1 = DateUtil.format(parse, "yyyy-MM-dd HH:mm:ss");
        System.out.println(format1);

    }
}
