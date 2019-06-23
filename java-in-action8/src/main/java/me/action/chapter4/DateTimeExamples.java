package me.action.chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-23
 * Copyright(©) 2019 by jaehyun.
 */
public class DateTimeExamples {
    public static void main(String[] args) {
        //useLocalDate();
        //useTempLocalDate();
        //useLocalTime();
        useLocalParse();
    }

    private static void useLocalDate() {
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);

        LocalDate date = LocalDate.of(2019, 06, 21);
        System.out.println("date : " + date);

        int year = date.getYear();
        System.out.println("year : " + year);

        Month month = date.getMonth();
        System.out.println("month : " + month);

        int day = date.getDayOfMonth();
        System.out.println("day : " + day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("dayOfWeek : " + dayOfWeek);

        int len = date.lengthOfMonth(); // 6월의 일수
        System.out.println("len : " + len);

        boolean leap = date.isLeapYear(); // 윤년이 아님
        System.out.println("leap : " + leap);
    }

    private static void useTempLocalDate() {
        LocalDate date = LocalDate.of(2019, 06, 21);
        System.out.println("date : " + date);

        int year = date.get(ChronoField.YEAR);
        System.out.println("year : " + year);

        int month = date.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("month : " + month);

        int day = date.get(ChronoField.DAY_OF_MONTH);
        System.out.println("year : " + year);
    }

    private static void useLocalTime() {
        LocalTime time = LocalTime.of(13, 45, 20);
        System.out.println("time : " + time);

        int hour = time.getHour();
        System.out.println("hour : " + hour);

        int minute = time.getMinute();
        System.out.println("minute : " + minute);

        int second = time.getSecond();
        System.out.println("second : " + second);
    }

    private static void useLocalParse() {
        LocalDate date = LocalDate.parse("2019-06-20");
        System.out.println("date : " + date);

        LocalTime time = LocalTime.parse("13:45:20");
        System.out.println("time : " + time);
    }
}
