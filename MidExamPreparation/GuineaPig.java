package MidExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double food = Double.parseDouble(scanner.nextLine());
            double hay = Double.parseDouble(scanner.nextLine());
            double cover = Double.parseDouble(scanner.nextLine());
            double guineaPigWeight = Double.parseDouble(scanner.nextLine());

            boolean needsSomething = false;
            for (int i = 1; i <= 30; i++) {
                food -= 0.3;
                if (i % 2 == 0) {
                    hay -= food * 0.05;
                }
                if (i % 3 == 0) {
                    cover -= guineaPigWeight / 3;
                }
                if (food <= 0.1) {
                    needsSomething = true;
                    break;
                } else if (hay <= 0) {
                    needsSomething = true;
                    break;
                } else if (cover <= 0) {
                    needsSomething = true;
                    break;
                }

            }
            if (needsSomething) {
                System.out.println("Merry must go to the pet store!");
            } else {
                System.out.printf("Everything is fine! Puppy is happy! " +
                        "Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);
            }


        }
    }
}
