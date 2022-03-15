package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= n; i++) {
            number = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", number, isSpecial);
            sum = 0;
            i = number;
        }

    }
}
