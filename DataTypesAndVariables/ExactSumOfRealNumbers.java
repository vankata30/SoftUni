package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());;
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < n; i++) {
            BigDecimal number = scanner.nextBigDecimal();
            sum = (sum.add(number));
        }
        System.out.println(sum);
    }
}
