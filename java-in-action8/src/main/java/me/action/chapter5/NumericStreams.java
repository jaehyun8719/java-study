package me.action.chapter5;

import me.action.chapter3.Dish;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-30
 * Copyright(©) 2019 by jaehyun.
 **/
public class NumericStreams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);

        // 5.6.1 숫자 스트림을 매핑
        int sumNumbers = numbers.stream()
                                .mapToInt(d -> d)
                                .sum();

        System.out.println("sumNumbers : " + sumNumbers);

        // 5.6.1 객체 스트림으로 복원하기
        IntStream intStream = numbers.stream()
                                     .mapToInt(d -> d);

        Stream<Integer> stream = intStream.boxed();

        // 5.6.1 기본값:OptionallInt
        OptionalInt maxNumbers = numbers.stream()
                                        .mapToInt(d -> d)
                                        .max();

        int max = maxNumbers.orElse(1);

        // 5.6.2 숫자 범위
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                                         .filter(n -> n % 2 == 0);

        System.out.println(evenNumbers.count());

    }

}
