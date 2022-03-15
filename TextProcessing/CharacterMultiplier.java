package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] String = scanner.nextLine().split(" ");


        System.out.println(getSum(String[0], String[1]));

    }

    private static int getSum(String firstString, String secondString) {
        int sum = 0;
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }

        } else {

            if (firstString.length() > secondString.length()) {
                for (int i = 0; i < second.length; i++) {
                    sum += first[i] * second[i];
                }
                int diff = firstString.length() - secondString.length();
                String remaining = firstString.substring(firstString.length() - diff);
                for (char symbol : remaining.toCharArray()) {
                    sum += symbol;
                }
            } else {
                for (int i = 0; i < first.length; i++) {
                    sum += first[i] * second[i];
                }
                int diff = secondString.length() - firstString.length();
                String remaining = secondString.substring(secondString.length() - diff);
                for (char symbol : remaining.toCharArray()) {
                    sum += symbol;
                }
            }
        }
        return sum;
    }
}
