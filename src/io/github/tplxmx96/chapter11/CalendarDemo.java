package io.github.tplxmx96.chapter11;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        //Calendar是一个抽象类，一般由子类GregorianCalendar实现
        Calendar cal = Calendar.getInstance();
        //使用日历打印当前的时间
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milliSecond = cal.get(Calendar.MILLISECOND);
        System.out.println("当前时间：");
        String strTime = String.format("%d-%02d-%d %02d-%d-%d：%s",
                year,month,day,hour,minute,second,milliSecond
        );
        System.out.println(strTime);

        //为日历对象设定时间
        cal.set(2018,6,14,14,28,4);
        Date date = cal.getTime();
        System.out.println(date.toLocaleString());

        //日期格式化类
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String strDate = format.format(date);
        System.out.println(strDate);
        //将字符串转换为Date类型
        Date newDate = format.parse("2017-12-30 23:59:59:999");
        System.out.println(newDate.toGMTString());


    }
    @Deprecated
    public static void test(){

    }
}
