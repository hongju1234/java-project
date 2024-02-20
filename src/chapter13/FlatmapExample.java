package chapter13;

import java.util.Arrays;
import java.util.List;

public class FlatmapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello world", "Java stream", "HiStream");
        // [Hello, World, Java, HiStream]
        list.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println); // [Hello,World,Java,stream,HiStream]

        List<Integer> list2 = Arrays.asList(1, 4, 2, 10, 8);
        // [1, 2, 4, 8, 10]
        list2.stream()
                .sorted()
                .forEach(System.out::println);



    }
}
