package com.itheima._时间日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime()+10*1000;
        Date d= new Date(time);
        System.out.println(d);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(d));


        //面试题给出时间"2021-01-01"把时间推后一天15个小时3分钟，显示当时的时间。
        String str="2021-01-01 00:00:00";
        Date parse = sdf.parse(str);
        long time1 = parse.getTime()+(24L * 60 * 60 + 15 * 60 * 60 + 3 * 60) * 1000;
        System.out.println(sdf.format(time1));


    }
}
