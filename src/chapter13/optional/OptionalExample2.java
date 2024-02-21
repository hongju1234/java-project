package chapter13.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        average
                .ifPresent(System.out::println); // 평균 값이 있을 때만 출력
    }
}
