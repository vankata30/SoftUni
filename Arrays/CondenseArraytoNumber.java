package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[nums.length - 1];
        if (nums.length == 1) {
            System.out.print(nums[0]);

        } else {
            for (int i = 0; i < condensed.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    condensed[j] = nums[j] + nums[j + 1];
                }
                nums = condensed;
            }
            int finalResult = condensed[0];
            System.out.println(finalResult);
        }
    }
}


