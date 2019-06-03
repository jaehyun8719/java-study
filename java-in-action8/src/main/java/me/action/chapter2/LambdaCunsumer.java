package me.action.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
public class LambdaCunsumer {
    public static void main(String[] args) {
        // 4.2 Cunsumer
        forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
    }

    // 4.2 Cunsumer
    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i : list) {
            c.accept(i);
        }
    }
}
