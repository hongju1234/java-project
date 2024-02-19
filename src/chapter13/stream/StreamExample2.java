package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        // 배열, 컬렉션으로부터 스트림 생성
        String[] arr = {"첫번째", "두번째"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.rangeClosed(1L, 5L);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2);
        doubleStream.forEach(System.out::println);

        List<String> list = Arrays.asList("a", "b", "b", "c", "d");
        // [a, b, c, d]
        list.stream().distinct().forEach(System.out::println);
    }
}
