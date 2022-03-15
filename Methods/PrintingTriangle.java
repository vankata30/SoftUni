package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input ; i++) {
            printTriangle(i);
        }
        for (int i = input-1; i >0 ; i--) {
            printTriangle(i);
        }


    }

    private static void printTriangle(int length) {

        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
