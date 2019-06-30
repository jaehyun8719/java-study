package me.action.chapter5;

import me.action.chapter3.Dish;

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
public class Finding {

    public static void main(String...args) {
        if(isVegetarianFriendlyMenu()) {
            System.out.println("Vegetarian friendly");
        }

        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> dish = findVegetarianDish();
        dish.ifPresent(d -> System.out.println(d.getName()));

        // 5.3.4 첫 번째 요소 찾기
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
                                                                   .map(x -> x * x)
                                                                   .filter(x -> x % 3 == 0)
                                                                   .findFirst();
        System.out.println(firstSquareDivisibleByThree.get());
    }

    // 5.3.1 프레디케이트가 적어도 한 요소와 일치하는지 확인
    private static boolean isVegetarianFriendlyMenu() {
        return Dish.menu.stream().anyMatch(d -> d.isVegetarian());
    }

    // 5.3.2 프레디케이트가 모든 요소와 일치하는지 검사
    private static boolean isHealthyMenu() {
        return Dish.menu.stream().allMatch(d -> d.getCalories() < 1000);
    }

    // 5.3.2 프레디케이트가 모든 요소와 일치하는지 검사
    private static boolean isHealthyMenu2() {
        return Dish.menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }

    // 5.3.3 요소 검색
    private static Optional<Dish> findVegetarianDish() {
        return Dish.menu.stream().filter(d -> d.isVegetarian()).findAny();
    }

}
