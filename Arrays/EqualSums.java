package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumBefore = 0;
        int sumAfter = 0;
        boolean isEqual = false;
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            sumBefore = 0;
            sumAfter = 0;
            for (int j = 0; j < i; j++) {
                sumBefore += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumAfter += array[j];
            }

            if (sumBefore == sumAfter) {
                System.out.println(i);
                isEqual = true;
                break;


            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
