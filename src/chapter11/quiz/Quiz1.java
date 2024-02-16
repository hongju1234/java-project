package chapter11.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "레드향");
        map.put(2, "사과");
        map.put(3, "바나나");
        map.put(4, "샤인머스켓");

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = map.get(key);
            System.out.println("[key]: " + key + ", [value]: " + value);
        }

    }
}
