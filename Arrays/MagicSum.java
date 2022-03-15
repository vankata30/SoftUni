package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length ; j++) {
                if (input[i] + input[j] == number){
                    System.out.println(input[i]+ " " + input[j]);
                }
            }
        }
    }
}
