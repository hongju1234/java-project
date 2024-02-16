package chapter12.example;

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

        MyFunctionalInterface2 f2 = a -> {
            System.out.println(a);
        };
        f2.method(2);


        MyFunctionalInterface3 f3 = (a, b) -> a * b;
            System.out.println(f3.method(2, 3));
        };
}
