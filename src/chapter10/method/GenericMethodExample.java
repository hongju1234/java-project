package chapter10.method;

import chapter09.Box;

import static chapter10.method.Util.*;
// 이렇게 처리하면 Util 선언 없이 메소드만 사용하여 호출 가능

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> box = boxing("string");
        String str = box.get();
        System.out.println(str);

        Box<Integer> box1 = boxing(1);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍주");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
