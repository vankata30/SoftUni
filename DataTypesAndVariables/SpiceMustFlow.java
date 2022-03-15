package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 0;
        int startingYield = scanner.nextInt();
        int yield = 0;
        int extractedSpice= 0;
        while (startingYield >= 100) {
            extractedSpice +=startingYield - 26;
            days++;
            startingYield-=10;
        }
        System.out.println(days);
        if (extractedSpice>=26) {
            System.out.println(extractedSpice - 26);
        } else {
            System.out.println(extractedSpice);
        }
    }
}
