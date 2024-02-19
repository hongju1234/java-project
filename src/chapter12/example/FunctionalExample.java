package chapter12.example;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.LongSupplier;

public class FunctionalExample {
    public static void main(String[] args) {
//        MyFunctionalInterface f = (a, b) -> {
//            System.out.println("매개변수가 있는 람다식");
//        };
//        f.test(1, 2);
//
//        // 인터페이스 객체 선언
//        MyFunctionalInterface f1 = new MyFunctionalInterface() {
//            @Override
//            public void test(int a, int b) {
//                System.out.println("람다식");
//            }
//        };
//    }
        MyFunctionalInterface f = () -> {
            System.out.println("매개변수가 없는 람다식");
        };
        f.method();

        MyFunctionalInterface2 f2 = (x) -> {
            System.out.println(x);
        };
        f2.method(2);

//        MyFunctionalInterface2 f2 = new MyFunctionalInterface2() {
//            @Override
//            public void method(int x) {
//                System.out.println(x);
//            }
//        };
//        f2.method(2);
//        이 코드를 람다식으로 바꾼게 그 위의 코드

        MyFunctionalInterface3 f3 = (a, b) -> a * b;
        System.out.println(f3.method(2, 3));


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> resultlist = list.stream().filter(x -> x%2 == 0).toList();

        System.out.println(list);
        System.out.println(resultlist);

        LongSupplier ls = () -> {
            long b = 34L;
            return b;
        };

        IntBinaryOperator io = Math::max;
        System.out.println(io.applyAsInt(3, 4));
//        클래스명::메서드명
    }

}
