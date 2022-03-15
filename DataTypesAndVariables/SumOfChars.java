package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n  = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            sum+= (int) ch;
        }
        System.out.printf("The sum equals: %d", sum);

    }
}
