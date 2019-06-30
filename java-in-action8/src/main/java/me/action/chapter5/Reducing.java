package me.action.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
public class Reducing {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,1,2);

        // 5.4.1 요소의 합
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("sum : " + sum);

        int sum_java8 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum_java8 : " + sum_java8);

        // 5.4.2 최대값과 치솟값
        Optional<Integer> max = numbers.stream().reduce((a, b) -> Integer.max(a, b));
        System.out.println("max : " + max.get());

        Optional<Integer> min = numbers.stream().reduce((a, b) -> Integer.min(a, b));
        System.out.println("min : " + min.get());
    }

}
