package me.action.chapter2;

import me.action.chapter1.Apple;

import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-05-29
 * Copyright(©) 2019 by jaehyun.
 */
public class Lambdas {

    public static void main(String[] args) {
        Comparator<Apple> byWeight = new Comparator<>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getColor().compareTo(a2.getColor());
            }
        };

        Comparator<Apple> byWeightLambda = (Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor());

        Predicate<Apple> a = (Apple apple) -> true;
    }
}
