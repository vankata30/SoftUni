package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLiters = 0;
        int capacity = 255;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int liters = scanner.nextInt();
            totalLiters+=liters;
            if (totalLiters>capacity){
                totalLiters-=liters;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(totalLiters);

    }
}
