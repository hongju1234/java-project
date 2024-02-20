package chapter12.daily;

import java.util.function.IntBinaryOperator;

public class LambdaExample_5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                // 매개변수 두 개르 받아서 최대값를 리턴하는 람다식
                Math::max
        );
        System.out.println("최대값 : " + max);

        int min = maxOrMin(
                // 매개변수 두 개를 받아서 최소값을 리턴하는 람다식
                Math::min
                // 클래스명::메소드명
        );
        System.out.println("최소값: " + min);
    }
}
