package chapter10.method;

import chapter09.Box;

public class Util {
    static final String DEFAULT = "default";
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static <T> T boxing2(T t)
    //앞에 <T>는 필수(미리 선언하는 것)
    {
        return null;
    }

    public static String getDefault() {
        return DEFAULT;
    }
}
