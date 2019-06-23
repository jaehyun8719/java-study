package me.action.chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

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
public class LocalDatetimeExamples {
    public static void main(String[] args) {
        useLocalDateTime();
    }

    private static void useLocalDateTime() {
        LocalDateTime dt1 = LocalDateTime.of(2019, Month.MARCH, 23, 20, 48, 11);
        System.out.println("dt1 : " + dt1);
        System.out.println("dt1.toLocalDate : " + dt1.toLocalDate());
        System.out.println("dt1.toLocalTime : " + dt1.toLocalTime());

        LocalDate date = LocalDate.of(2019, 06, 21);
        LocalTime time = LocalTime.of(13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        System.out.println("dt2 : " + dt2);

        LocalDateTime dt3 = date.atTime(10, 30, 25);
        System.out.println("dt3 : " + dt3);

        LocalDateTime dt4 = date.atTime(time);
        System.out.println("dt4 : " + dt4);

        LocalDateTime dt5 = time.atDate(date);
        System.out.println("dt5 : " + dt5);
    }
}
