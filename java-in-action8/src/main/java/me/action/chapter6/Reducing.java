package me.action.chapter6;

import java.util.Optional;

import static java.util.stream.Collectors.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-07-06
 * Copyright(©) 2019 by jaehyun.
 **/
public class Reducing {

    public static void main(String[] args) {
        int totalCalories = Dish.menu.stream().collect(summingInt(dish -> dish.getCalories()));
        System.out.println(totalCalories);

        double avgCalories = Dish.menu.stream().collect(averagingInt(dish -> dish.getCalories()));
        System.out.println(avgCalories);

        String shortMenu = Dish.menu.stream().map(dish -> dish.getName()).collect(joining(", "));
        System.out.println(shortMenu);

        int reducingTotalCalories = Dish.menu.stream().collect(reducing(0, dish -> dish.getCalories(), (i, j) -> i + j));
        System.out.println(reducingTotalCalories);

        Optional<Dish> mostCaloriesDish = Dish.menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println(mostCaloriesDish);
    }

}
