package chapter13.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        List<String> stringList = integerList.stream()
                .distinct() // 중복제거
                .map(String::valueOf) // string 으로 변환 element -> String.valueOf(element)
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
