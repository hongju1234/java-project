package chapter12.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> f = Member::new;
        f.apply("아이디"); // = new Member("아이디");

        BiFunction<String, String, Member> f2 = Member::new;
        f2.apply("이름", "아이디"); // = new Member("이름", "아이디");

        Supplier<Member> s = Member::new;
        Member member = s.get(); // = new Member();

        Consumer<String> con = System.out::println;
//        Consumer<String> con = (r) -> {
//            System.out.println(r);
//        };
        con.accept("값 출력");


        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(System.out::println);
//        list.stream().forEach(e -> System.out.println(e));

    }

}
