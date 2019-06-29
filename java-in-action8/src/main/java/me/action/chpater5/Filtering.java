package me.action.chpater5;

import me.action.chapter3.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-29
 * Copyright(©) 2019 by jaehyun.
 **/
public class Filtering {

    public static void main(String[] args) {
        // 5.1.1 프레디케이트로 필터링
        List<Dish> vegetarianMenu = Dish.menu.stream()
                                             .filter(d -> d.isVegetarian())
                                             .collect(toList());

        // 5.1.2 고유 요소 필터링
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
               .filter(i -> i % 2 == 0)
               .forEach(i -> System.out.println(i));

        System.out.println("---------------------------------------");

        List<Integer> numbers2 = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers2.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(i -> System.out.println(i));

        // 5.1.3 스트림 축소
        List<Dish> dishes = Dish.menu.stream()
                                     .filter(d -> d.getCalories() > 500)
                                     .collect(toList());
        System.out.println(dishes);

        System.out.println("---------------------------------------");

        List<Dish> dishes2 = Dish.menu.stream()
                                      .filter(d -> d.getCalories() > 500)
                                      .limit(2)
                                      .collect(toList());
        System.out.println(dishes2);

        // 5.1.4 요소 건너뛰기
        List<Dish> skipDishes = Dish.menu.stream()
                                         .filter(d -> d.getCalories() > 500)
                                         .collect(toList());
        System.out.println(skipDishes);

        System.out.println("---------------------------------------");

        List<Dish> skipDishes2 = Dish.menu.stream()
                                          .filter(d -> d.getCalories() > 500)
                                          .skip(2)
                                          .collect(toList());
        System.out.println(skipDishes2);

    }

}
