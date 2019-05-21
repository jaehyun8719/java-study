package me.action.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-05-19
 * Description:
 * Copyright(©) 2019 by jaehyun.
 **/
public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> apple = Arrays.asList(new Apple(100, "green")
                                            , new Apple(160, "red"));

        // 1.1 녹색 사과 필터링
        List<Apple> greenApples = filterGreenApples(apple);
        System.out.println(greenApples.toString());

        // 1.2 색을 파라미터화
        List<Apple> greenApplesColor = filterApplesByColor(apple, "green");
        System.out.println(greenApplesColor.toString());

        List<Apple> redApplesColor = filterApplesByColor(apple, "red");
        System.out.println(redApplesColor.toString());

        // 1.3 가능한 모든 속성으로 필터링
        List<Apple> filterGreenApples = filterApples(apple, "green", 0, true);
        System.out.println(filterGreenApples.toString());

        List<Apple> filterRedApples = filterApples(apple, "red", 150, false);
        System.out.println(filterRedApples.toString());

        // 2.1 동작 파라미터화
        List<Apple> filterGreenApplesPredicate = filterApplesPredicate(apple, new AppleGreenColorPredicate());
        System.out.println(filterGreenApplesPredicate.toString());

        List<Apple> filterRedApplesPredicate = filterApplesPredicate(apple, new AppleHeavyWeightPredicate());
        System.out.println(filterRedApplesPredicate.toString());
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesPredicate(List<Apple> inventory, ApplePredicate p) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
