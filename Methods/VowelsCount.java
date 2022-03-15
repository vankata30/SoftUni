package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        countVowels(input);
    }

    private static void countVowels(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'A' || currentChar=='a'|| currentChar == 'I' || currentChar=='i'|| currentChar == 'E' || currentChar=='e'||
                    currentChar == 'O' || currentChar=='o'|| currentChar == 'U' || currentChar=='u'){
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);

    }
}
