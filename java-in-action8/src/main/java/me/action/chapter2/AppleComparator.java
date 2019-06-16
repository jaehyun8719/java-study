package me.action.chapter2;

import me.action.chapter1.Apple;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-11
 * Copyright(©) 2019 by jaehyun.
 */
public class AppleComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getColor().compareTo(a2.getColor());
    }
}
