package me.action.chapter2;

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
        List<Apple> apple = Arrays.asList(new Apple(150, "green")
                                            , new Apple(200, "red"));

        List<Apple> greenApple = filterGreenApples(apple);
        System.out.printf(greenApple.toString());
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
}
