package me.action.chapter4;

import java.time.*;
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
public class DurationAndPeriodExamples {
    public static void main(String[] args) {
        useDurationAndPeroid();
    }

    private static void useDurationAndPeroid() {
        LocalTime time = LocalTime.of(13, 45, 20);

        Instant instant = Instant.ofEpochSecond(44 * 365 * 86400);
        Instant now = Instant.now();

        Duration d1 = Duration.between(LocalTime.of(13, 45, 10), time);
        Duration d2 = Duration.between(instant, now);
        System.out.println("d1.getSeconds : " + d1.getSeconds());
        System.out.println("d2.getSeconds : " + d2.getSeconds());

        Duration threeMinutes = Duration.ofMinutes(3);
        System.out.println("threeMinutes : " + threeMinutes);

        Duration threeMinutes2 = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println("threeMinutes2 : " + threeMinutes2);

        Period tendays = Period.ofDays(10);
        System.out.println("tendays : " + tendays);

        Period threeWeeks = Period.ofWeeks(3);
        System.out.println("threeWeeks : " + threeWeeks);

        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
        System.out.println("twoYearsSixMonthsOneDay : " + twoYearsSixMonthsOneDay);
    }
}
