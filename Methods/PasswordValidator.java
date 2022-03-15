package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();
        checkPassword(password);


    }

    private static void checkPassword(String password) {
        boolean length = true;
        boolean lettersAndDigits = true;
        boolean twoDigits = true;
        int digitCount = 0;

        if (password.length() < 6 || password.length() >10){
            System.out.println("Password must be between 6 and 10 characters");
            length = false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i)>=48 && password.charAt(i) <= 57 || password.charAt(i) >= 65 && password.charAt(i)<=122 )
                continue;
            else{
                System.out.println("Password must consist only of letters and digits");
                lettersAndDigits = false;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i)<=57){
                digitCount++;
            }
        }
        if (digitCount<2){
            System.out.println("Password must have at least 2 digits");
            twoDigits = false;
        }
        if (length && lettersAndDigits && twoDigits){
            System.out.println("Password is valid");
        }

    }
}
