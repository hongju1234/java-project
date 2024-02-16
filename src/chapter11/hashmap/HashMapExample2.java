package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("야옹이", 1);
        map.put("멍멍이", 2);
        System.out.println("총 Entry 수: " + map.size());

        // 2. 객체 찾기
        System.out.println("야옹이 찾기: " + map.get("야옹이"));

        // 3. 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.getOrDefault(key, 0);
            //예외 방지를 위해 getOrDefault를 줘서 value가 없더라도 0이 출력 되도록 함
            System.out.println("\tkey: " + key + ", value: " + value);
        }

        // 4. 객체 삭제
        map.remove("멍멍이");
        System.out.println("총 Entry 수: " + map.size());

        // 5. 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
            System.out.println("\tkey: " + entry.getKey() + ", value: " + entry.getValue());
        } // 향상된 for문

        // 6. 모든 Map.Entry 삭제
        map.clear();
        System.out.println("삭제 후 Entry 수: " + map.size());
    }
}
