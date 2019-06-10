package me.action.chapter2;

import me.action.chapter1.Apple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        // 3.1 1단계: 동작파라미터화를 기억하라
        // 3.2 2단계 함수형 인터페이스를 이용해서 전달
        try {
            String result = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3.5.3 형식 추론
        Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor());
        Comparator<Apple> c2 = (a1, a2) -> a1.getColor().compareTo(a2.getColor());

        // 3.5.4 지역 변수 사용
        int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);

    }

    // 3.1
    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }

}
