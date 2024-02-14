package chapter09;

import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        String filepath = System.getProperty("user.dir");
        try (FileInputStream inputStream = new FileInputStream(filepath))  // ->네번째
        {
            inputStream.read(); //파일을 읽습니다. -> 첫번째 출력
            inputStream.close(); //AutoCloseable.close() 재정의 -> 두번째 출력
            System.out.println("test"); // -> 세번째 출력
            throw new Exception(); //예외 발생시켜봄

        } catch (Exception e) {
            System.out.println("Exception 처리"); // -> 다섯번째
        }
    }
}
