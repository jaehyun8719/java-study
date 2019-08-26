package me.action.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : kjh
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-03
 * Copyright(©) 2019 by jaehyun.
 */
public class LambdasPredicate {

    public static void main(String[] args) {
        // 4.1 LambdasPredicate
        java.util.function.Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();

        List<String> listOfString = Arrays.asList("green", "red", "");
        List<String> nonEmpty = filter(listOfString, nonEmptyStringPredicate);
    }

    // 4.1 LambdasPredicate
    public static <T> List<T> filter(List<T> list, java.util.function.Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }
}
