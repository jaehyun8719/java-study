package me.action.chpater5;

import me.action.chapter3.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-29
 * Copyright(©) 2019 by jaehyun.
 **/
public class Mapping {

    public static void main(String[] args) {
        // 5.2.1 스트림의 각 요소에 함수 적용하기
        List<String> dishNames = Dish.menu.stream()
                                          .map(d -> d.getName())
                                          .collect(toList());
        System.out.println(dishNames);

        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream()
                                         .map(s -> s.length())
                                         .collect(toList());
        System.out.println(wordLengths);

        // 5.2.2 스트림 평면화
        List<String> flatWords = Arrays.asList("Hello", "World");
        List<String> uniqueCharaters = flatWords.stream()
                                                .map(w -> w.split("")) // 각 단어를 개별 문자열 배열로 변환
                                                .flatMap(w -> Arrays.stream(w)) // 생성된 스트림을 하나의 스트림으로 평면화
                                                .distinct()
                                                .collect(toList());
        System.out.println(uniqueCharaters);

    }

}
