package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")){
            char[] ch = new char[number.length()];

            for (int i = 0; i < ch.length ; i++) {
                ch[i] = number.charAt(i);
            }
            char[] result = reverseNumber(ch);
            if (Arrays.equals(result, ch)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            number = scanner.nextLine();

        }



    }

    private static char[] reverseNumber(char[] numberArr) {
        char[] reverseNumber = new char[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            reverseNumber[i] =  numberArr[numberArr.length-(i+1)];
        }
        return reverseNumber;
    }
}
