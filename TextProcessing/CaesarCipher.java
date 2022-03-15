package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decryptedMessage = scanner.nextLine();
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < decryptedMessage.length(); i++) {
            encryptedMessage.append((char) (decryptedMessage.charAt(i)+3));
        }
        System.out.println(encryptedMessage);




    }
}
