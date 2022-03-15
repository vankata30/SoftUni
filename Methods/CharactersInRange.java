package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.next().charAt(0);
        char secondChar = scanner.next().charAt(0);
        printCharsBetween(firstChar,secondChar);

    }

    private static void printCharsBetween(char firstChar, char secondChar) {
        if (firstChar> secondChar){
            for (int i = 1+ secondChar; i <firstChar ; i++) {
                System.out.print((char)i + " ");
            }
        }else{

            for (int i = 1+ firstChar; i <secondChar ; i++) {
                System.out.print((char)i + " ");
            }
        }
    }
}
