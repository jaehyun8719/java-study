package me.action.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-16
 * Copyright(©) 2019 by jaehyun.
 **/
public class StreamBasic {

    public static void main(String[] args) {

        // Java 7 코드
        getLowCaloricDishesNamesInJava7(Dish.menu).forEach(x -> System.out.println(x));

        // Java 8 코드
        getLowCaloricDishesNamesInJava8(Dish.menu).forEach(x -> System.out.println(x));

        // Java 8 코드 병렬처리
        getLowCaloricDishesNamesInJava8Parellel(Dish.menu).forEach(x -> System.out.println(x));

    }

    // Java 7 코드
    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        List<String> lowCaloricDishesName = new ArrayList<>();
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });

        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }

        return lowCaloricDishesName;
    }

    // Java 8 코드
    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
        List<String> collect = dishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(dish -> dish.getCalories()))
                .map(dish -> dish.getName())
                .collect(toList());

        return collect;
    }

    // Java 8 코드 병렬처리
    public static List<String> getLowCaloricDishesNamesInJava8Parellel(List<Dish> dishes) {
        List<String> collect = dishes.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(dish -> dish.getCalories()))
                .map(dish -> dish.getName())
                .collect(toList());

        return collect;
    }

}