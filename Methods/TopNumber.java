package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            boolean sumIsDivisible = sumDigits(i);
            boolean isOdd = findOddDigits(i);
            if (sumIsDivisible && isOdd) {
                System.out.println(i);
            }
        }
    }

    private static boolean findOddDigits(int number) {
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean sumDigits(int number) {
        int digit = 0;
        int sumOfDigits = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            sumOfDigits += digit;
        }

        return (sumOfDigits % 8 == 0);
    }
}


