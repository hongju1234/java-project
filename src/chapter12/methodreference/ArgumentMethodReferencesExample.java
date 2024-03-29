package chapter12.methodreference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a, b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Java8", "JAVA8"));
        //위는 람다식 아래는 메서드 참조형 (같은 코드)
        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Java8", "JAVA8"));
    }

    public static void print(int order) {
        if (order < 0) {
            System.out.println("사전순으로 먼저 옵니다.");
        } else if (order == 0) {
            System.out.println("동일한 문자열");
        } else {
            System.out.println("사전순으로 나중에 옵니다.");
        }
    }
}
