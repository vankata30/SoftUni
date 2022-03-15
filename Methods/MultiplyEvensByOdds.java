package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(number));


    }

    private static int getMultipleOfEvensAndOdds(int number) {
        return getEvenSum(number) * getOddSum(number);
    }

    private static int getOddSum(int number) {
        int sum = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (digit % 2 == 1) {
                sum += digit;
            }
        }
        return sum;
    }

    private static int getEvenSum(int number) {
        int sum = 0;
        int digit = 0;
        while (number > 0){
            digit = number %10;
            number /=10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
