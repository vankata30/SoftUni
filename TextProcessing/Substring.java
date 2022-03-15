package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();
        while (text.contains(word)) {
            text = text.replaceAll(word, "");
        }
        System.out.println(text);

    }
}
