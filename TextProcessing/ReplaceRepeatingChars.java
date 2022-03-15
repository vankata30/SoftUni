package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        text.append(scanner.nextLine());
        StringBuilder newText = new StringBuilder();

        char previousChar = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (previousChar!= text.charAt(i)){
                newText.append(text.charAt(i));
            }
            previousChar = text.charAt(i);
        }
        System.out.println(newText);


    }
}
