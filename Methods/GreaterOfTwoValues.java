package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));

                break;
            case "char":
                char firstChar = scanner.next().charAt(0);
                char secondChar = scanner.next().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }


    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);

    }
    private static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar){
            return firstChar;
        }
        return secondChar;

    }
    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString)>=0){
            return firstString;
        }
        return secondString;


    }
}
