package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        stringStream.forEach(System.out::println);
    }
}
