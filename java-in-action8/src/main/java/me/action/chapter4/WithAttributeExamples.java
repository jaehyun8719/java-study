package me.action.chapter4;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

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
public class WithAttributeExamples {
    public static void main(String[] args) {
        //userAbsoluteWithAttribute();
        userRelativeWithAttribute();
    }

    private static void userAbsoluteWithAttribute() {
        LocalDate date1 = LocalDate.of(2019, 06, 23);
        System.out.println("date1 : " + date1);

        LocalDate date2 = date1.withYear(2018);
        System.out.println("date2 : " + date2);

        LocalDate date3 = date2.withDayOfMonth(30);
        System.out.println("date3 : " + date3);

        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 7);
        System.out.println("date4 : " + date4);
    }

    private static void userRelativeWithAttribute() {
        LocalDate date1 = LocalDate.of(2019, 06, 23);
        System.out.println("date1 : " + date1);

        LocalDate date2 = date1.plusWeeks(1);
        System.out.println("date2 : " + date2);

        LocalDate date3 = date2.minusWeeks(3);
        System.out.println("date3 : " + date3);

        LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS);
        System.out.println("date4 : " + date4);
    }
}
