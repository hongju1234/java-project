package chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("str");
        list.add("1234");
        list.add("4.5");
        String str = list.get(1); // 제네릭 <String> 사용함으로써 Type 변환 불필요
        String str2 = list.get(2);


    }
}
