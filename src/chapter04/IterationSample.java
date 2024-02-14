package chapter04;

public class IterationSample {
    public static void main(String[] args) {
        // 1 ~ 5
        int[] array = {89,90,91,92,93,94,95,96,97,98,99};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] numbers = {89,90,91,92,93,94,95,96,97,98,99};
        for (int number : numbers) {
            System.out.println(number);
        }
    }


}
