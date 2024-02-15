package chapter10.method;

import chapter09.Box;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static <T> T boxing2(T t)
    //앞에 <T> 없으면 에러. (미리 선언하는 것)
    {
        return null;
    }
}
