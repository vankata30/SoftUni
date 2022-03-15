package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] users = input.split(", ");
        for (String user : users) {
            if (validateUser(user)) {
                System.out.println(user);
            }
        }

    }

    private static boolean validateUser(String user) {
        if (user.length() < 3 || user.length() > 16) {
            return false;
        }
        for (char symbol : user.toCharArray()) {
            if (!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))) {
                return false;
            }
        }
        return true;

    }
}
