package me.action.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-16
 * Copyright(©) 2019 by jaehyun.
 **/
public class StreamVsCollection {

    public static void main(String...args){
        List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
       // s.forEach(System.out::println); // java.lang.IllegalStateException 스트림이 이미 소비되었거나 닫힘

        // 외부 반복
        List<String> nameList = new ArrayList<>();
        for (String name : names) {
            nameList.add(name);
        }
        System.out.println("nameList = [" + nameList + "]");

        List<String> nameList2 = new ArrayList<>();
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            nameList2.add(name);
        }
        System.out.println("nameList2 = [" + nameList2 + "]");


        // 내부 반복
        List<String> externalNames = names.stream()
                                        .map(s1 -> names.get(0))
                                        .collect(toList());
        externalNames.forEach(x -> System.out.println("externalNames = [" + x + "]"));


    }
}
