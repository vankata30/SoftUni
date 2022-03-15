package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (product){
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1.0;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.0;
                break;
        }
        printTotalPrice(price,amount);

    }

    private static void printTotalPrice(double price, int amount) {
        System.out.printf("%.2f", amount*price);
    }
}
