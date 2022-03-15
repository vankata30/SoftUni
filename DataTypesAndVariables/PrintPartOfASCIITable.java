package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <=b ; i++) {
            System.out.print((char)i + " ");
        }
    }
}
