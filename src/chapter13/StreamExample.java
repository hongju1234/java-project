package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 배열, 컬렉션으로부터 스트림 생성
        String[] arr = {"첫번째", "두번째"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 5);

        LongStream longStream = LongStream.rangeClosed(1L, 5L);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2);
        doubleStream.forEach(System.out::println);

        List<String> list = Arrays.asList("a", "b", "b", "c", "d");
        // [a, b, c, d]
        list.stream().distinct().forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(1, 10, 4, 5, 1, 2);
        list2.stream().distinct().forEach(System.out::println);
    }
}
