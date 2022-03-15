package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "subtract":
                subtract(a, b);
                break;
            case "add":
                add(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            case "multiply":
                multiply(a,b);
                break;
        }


    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void divide(int a, int b) {
        System.out.println(a/b);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a-b);
    }
}
