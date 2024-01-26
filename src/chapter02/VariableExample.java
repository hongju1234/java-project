package chapter02;
//변수 선언 예제
public class VariableExample {

    int a = 0; // 멤버 변수, 필드
    public static void main(String[] args) {
        int value = 10;

        if (value == 10) {
            int value2 = 11;
            System.out.println(value2);
        }

        for (int i = 0; i < 5; i++) {
            int value2 = 1;
            System.out.println(value + 1);
            System.out.println(value2 + 1);
        }

        System.out.println(value);
        //System.out.println(value2); //value2 변수가 안불러져와서 오류
//변수 타입 예제
        double var1 = 3.14;
        float var2 = 3.14f;
        //정밀도 테스트
        double var3 = 0.1234567890123456789;
        float var4 = 0.1234567890123456789F;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

    }


}
