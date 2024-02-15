package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        // hashmap 객체 생성, put
        hashmap.put("key1", 1);
        hashmap.put("key2", 2);
        hashmap.put("key3", 3);
        System.out.println(hashmap);

        Integer v = hashmap.getOrDefault("key", 0);
        Integer v2 = hashmap.get("key");
        System.out.println(v);
        System.out.println(v2); // key값이 없어서 null 출력

        // 객체 검색
        boolean isContains = hashmap.containsKey("없는키");
        System.out.println("isContains = " + isContains);
        boolean containsValue = hashmap.containsValue(3);
        System.out.println("containsValue = " + containsValue);

        Set<String> keySet = hashmap.keySet();
        System.out.println(keySet);
        // [key1, key2, key3] 출력됨

        Iterator<String> iterator = hashmap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashmap.get(key);
            System.out.println(key + ":" + value);
        }
        // key1:1 key2:2 key3:3 출력됨

        // entrySet -> 키와 값을 모두 추출
        Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry);
        }
        // key1=1 key2=2 key3=3 출력됨


//        for (String key : map.keySet());
//        System.out.println(key);
//        System.out.println(map.get(key));
//        //간단버전

    }
}
