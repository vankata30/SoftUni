package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double area = calculateArea(a, b);
        System.out.printf("%.0f", area);
    }

    private static double calculateArea(double a, double b) {
        return a*b;
    }
}
