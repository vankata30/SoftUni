package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double max = Integer.MIN_VALUE;
        int highestTime = 0;
        int highestQuality = 0;
        int highestSnow = 0;
        for (int i = 0; i < N; i++) {
            int snowballSnow = scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > max) {
                max = snowballValue;
                highestQuality = snowballQuality;
                highestSnow = snowballSnow;
                highestTime = snowballTime;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, max, highestQuality);
    }
}
