package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedArray = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i < bannedArray.length; i++) {
            String bannedWord = bannedArray[i];
            if (text.contains(bannedWord)){
                String replacement = repeatString("*", bannedWord.length());

                text =text.replaceAll(bannedWord, replacement);
            }
        }
        System.out.println(text);




    }
    public static String repeatString(String word, int count){
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
