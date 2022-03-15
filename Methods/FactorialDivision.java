package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double firstNumFactorial = findFactorials(firstNum);
        double secondNumFactorial = findFactorials(secondNum);

        System.out.printf("%.2f",firstNumFactorial/secondNumFactorial);



    }

    private static double findFactorials(double Num) {
        double factorial = 1;
        double secondFactorial = 1;
        for (int i = 1; i <= Num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
