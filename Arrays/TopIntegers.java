package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println(numbers[numbers.length-1]);

    }
}
