package me.action.chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

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
public class AdjusterExamples {
    public static void main(String[] args) {
        useTemporalAdjuster();
    }

    private static void useTemporalAdjuster() {
        LocalDate date1 = LocalDate.of(2019, 06, 21);
        System.out.println("date1 : " + date1);

        LocalDate date2 = date1.with(nextOrSame(DayOfWeek.SUNDAY));
        System.out.println("date2 : " + date2);

        LocalDate date3 = date2.with(lastDayOfMonth());
        System.out.println("date3 : " + date3);
    }
}
