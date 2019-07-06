package me.action.chapter6;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

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
public class Grouping {

    enum CaloricLevel { DIET, NORMAL, FAT };

    public static void main(String[] args) {
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByCaloricLevel = Dish.menu.stream().collect(
                groupingBy(dish -> dish.getType(),
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) {
                                return CaloricLevel.DIET;
                            } else if (dish.getCalories() <= 700) {
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        })
                )
        );
        System.out.println(dishesByCaloricLevel);
    }

}
