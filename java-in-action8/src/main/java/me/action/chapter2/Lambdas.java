package me.action.chapter2;

import me.action.chapter1.Apple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        // 3.7.1 코드 전달
        List<Apple> inventory = Arrays.asList(
                new Apple(100, "white")
                , new Apple(110, "green")
                , new Apple(170, "red")
                , new Apple(100, "red"));
        inventory.sort(new AppleComparator());

        // 익명 클래스
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getColor().compareTo(a2.getColor());
            }
        });


        // 람다 표현식
        inventory.sort((Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor()));

        // 람다 표현식 형식 추론
        inventory.sort(Comparator.comparing((a1) -> a1.getColor()));

        // 메서드 레퍼런스 사용
        inventory.sort(Comparator.comparing(Apple::getColor));

        // 3.8.1 Comparator
        // 조합 역정렬
        inventory.sort(Comparator.comparing(Apple::getColor).reversed());
        // Comparator 연결
        inventory.sort(Comparator.comparing(Apple::getColor)
                    .reversed()
                    .thenComparing(Apple::getWeight));

        //inventory.forEach(System.out::println);

        //3.8.2 Predicate 조합
        Predicate<Apple> appleGreenTrue = (Apple apple) -> "red".equals(apple.getColor());
        //inventory.forEach((Apple apple) -> System.out.println(appleGreenTrue.test(apple)));

        //System.out.println("------------------------------------");

        Predicate<Apple> appleGreenFalse = appleGreenTrue.negate();
        //inventory.forEach((Apple apple) -> System.out.println(appleGreenFalse.test(apple)));

        Predicate<Apple> redAndHeavy = appleGreenTrue.and((Apple apple) -> apple.getWeight() > 90);
        //inventory.forEach((Apple apple) -> System.out.println(redAndHeavy.test(apple)));

        Predicate<Apple> redAndHeavyOrGreen = appleGreenTrue.and((Apple apple) -> apple.getWeight() > 90)
                                                            .or((Apple apple) -> "green".equals(apple.getColor()));
        inventory.forEach((Apple apple) -> System.out.println(redAndHeavyOrGreen.test(apple)));


    }

    // 3.1
    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }
}
