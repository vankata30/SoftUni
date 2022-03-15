package DataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char firstLetter = (char)('a' + i);
            for (int j = 0; j < n; j++) {
                char secondLetter = (char)('a'+j);
                for (int k = 0; k < n; k++) {
                    char thirdLetter = (char)('a'+k);
                    System.out.printf("%c%c%c%n",firstLetter, secondLetter, thirdLetter);
                }

            }
        }

    }
}
