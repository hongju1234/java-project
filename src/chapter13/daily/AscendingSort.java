package chapter13.daily;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
입력예제 1
        3
        1 3 5 (array1) i
        5
        2 3 6 7 9 (array2) j

출력예제 1
        1 2 3 3 5 6 7 9  index
 */
public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int index = 0; int i = 0; int j = 0;

        // 코드 작성
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[index] = array1[i];
                index++; i++;
            } else {
                result[index] = array2[j];
                index++; j++;
            }
        }

        while (i< array1.length) {
            result[index] = array1[i];
            index++; i++;
        }

        while (i< array2.length) {
            result[index] = array2[j];
            index++;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
