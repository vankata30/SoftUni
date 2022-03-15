package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int citiesNumber = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        for (int i = 1; i <= citiesNumber; i++) {
            String city = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double currentCityProfit = 0;
            if (i % 3 == 0 && i % 5 != 0) {
                currentCityProfit = income - (expenses * 1.5);
            } else if (i % 5 == 0) {
                currentCityProfit = (income * 0.9) - expenses;
            } else {
                currentCityProfit = income - expenses;
            }
            totalProfit += currentCityProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, currentCityProfit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);


    }
}
