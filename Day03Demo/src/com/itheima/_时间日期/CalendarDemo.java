package com.itheima._时间日期;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //通过调用日历类的静态方法getInstance得到一个当前此刻的日期对象对应的日历对象
        Calendar calendar= Calendar.getInstance();
        //获取年
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        //获取月
        int mm = calendar.get(Calendar.MONTH)+1;
        System.out.println(mm);
        //获取一年中的第几天
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        //修改日历信息
//        calendar.set(Calendar.YEAR,2099);
//        System.out.println(calendar.set(Calendar.YEAR,2099));

        calendar.add(Calendar.DAY_OF_YEAR,701);
        calendar.add(Calendar.HOUR,7);
        long t=calendar.getTimeInMillis();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(t));


    }
}
