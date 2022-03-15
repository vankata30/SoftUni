package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract (sum(firstNum,secondNum), thirdNum));


    }

    private static int subtract(int a, int b) {
        return a-b;
    }

    private static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
