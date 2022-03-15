package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        printMiddleChar(line);


    }

    private static void printMiddleChar(String line) {

        if (line.length() % 2 ==1){
            System.out.println(line.charAt(line.length()/2));
        } else {
//            System.out.print(line.charAt((line.length()/2) - 1));
//            System.out.println(line.charAt(line.length()/2));
            System.out.printf("%c%c%n",line.charAt((line.length()/2) - 1),line.charAt(line.length()/2) );
        }
    }
}
