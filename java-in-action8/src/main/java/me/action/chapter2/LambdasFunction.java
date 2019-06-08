package me.action.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

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
public class LambdasFunction {
    public static void main(String[] args) {
        // 4.3 Function
        List<Integer> l = map(Arrays.asList("lambdas" ,"in", "action"), (String s) -> s.length());
    }

    // 4.3 Function
    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T s : list) {
            result.add(f.apply(s));
        }
        return result;
    }
}
