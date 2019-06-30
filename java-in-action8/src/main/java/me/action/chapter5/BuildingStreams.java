package me.action.chapter5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : 진실
 * github: https://github.com/jaehyun8719
 * email: jaehyun8719@gmail.com
 * <p>
 * Date: 2019-06-30
 * Copyright(©) 2019 by jaehyun.
 **/
public class BuildingStreams {

    public static void main(String[] args) {
        // Stream.of
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(s -> s.toUpperCase()).forEach(System.out::println);

        // Stream.empty
        Stream<String> emptyStream = Stream.empty();

        // Arrays.stream
        int[] numbers = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());

        // File.stream
        long uniqueWords = 0;
        try (Stream<String> lines =  Files.lines(Paths.get("me/action/chapter5/data.txt"), Charset.defaultCharset())) { // 스트림은 자원을 자동으로 해제할 수 있는 AutoClosable 이다.
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))) // 단어 스트림 생성
                                    .distinct() // 중복 제거
                                    .count(); // 고유 단어 수 계산
        } catch (IOException e) {
            e.printStackTrace(); // 파일을 열다가 예외가 발생하면 처리한다.
        }

        System.out.println(uniqueWords);

        // iterate
        Stream.iterate(0 ,n -> n + 2)
              .limit(10)
              .forEach(i -> System.out.println(i));

        // generate
        Stream.generate(() -> Math.random())
              .limit(5)
              .forEach(i -> System.out.println(i));
    }

}
