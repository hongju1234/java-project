package chapter09;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/test.txt";
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))
////             BufferedWriter wr = new BufferedWriter(new FileWriter(filePath))
//        ){
//            System.out.println(br.readLine());
//
//        } catch (IOException e) {
//            System.out.println("예외처리 로직");
//        }
//        System.out.println(System.getProperty("user.dir"));
//        -> 프로젝트 경로 불러오기

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            System.out.println(br.readLine());
        } catch (IOException e) {
             //IOException 예외 처리
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    //예외처리
                }
            }
        }
    }
}

