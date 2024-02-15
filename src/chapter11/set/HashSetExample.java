package chapter11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //객체 생성
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("1"); // List와 다른점: 중복값 저장 안됨
        System.out.println(stringSet);
        //저장된 순서 상관 없이 출력

        // 객체 검색
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(stringSet.size());

        // 향상된 for문
        for (String str : stringSet) {
            System.out.println(str);
        }

        // 객체 삭제
        boolean isRemoved = stringSet.remove("없는요소");  // remove() 원하는 객체 선택 삭제
        System.out.println("isRemoved = " + isRemoved);
        stringSet.clear();
        System.out.println(stringSet);

        Set<Member> personSet = new HashSet<>();
        personSet.add(new Member("",10));
    }
}
