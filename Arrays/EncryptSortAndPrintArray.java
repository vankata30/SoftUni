package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            int sum = 0;
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'a' || line.charAt(j) == 'e'
                        || line.charAt(j) == 'u' || line.charAt(j) == 'i' || line.charAt(j) == 'o' ||
                        line.charAt(j) == 'A' || line.charAt(j) == 'E'
                        || line.charAt(j) == 'U' || line.charAt(j) == 'I' || line.charAt(j) == 'O') {
                    sum += line.charAt(j) * line.length();
                } else {
                    sum += line.charAt(j) / line.length();
                }

            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
