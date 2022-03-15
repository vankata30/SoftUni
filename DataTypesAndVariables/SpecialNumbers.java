package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum =0;
            int number = i;
            while (number>0){
                int digit = number % 10;
                sum+=digit;
                number/=10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if (isSpecial){
                System.out.printf("%d -> True%n",i);
            } else{
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
