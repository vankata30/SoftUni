package TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");

        for (String s : strArr){
            System.out.print(repeatString(s, s.length()));

        }

    }
    public static String repeatString(String word, int count){
        String[] repeatedArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatedArr[i] = word;
        }
        return String.join("", repeatedArr);
    }
}

