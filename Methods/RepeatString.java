package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println( repeatString(n, line));

    }

    private static String repeatString(int n, String line) {
        String newLine = "";
        for (int i = 0; i < n; i++) {
             newLine += line;
        }

        return newLine;
    }
}
