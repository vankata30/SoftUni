package DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int sum = a+b;
        int result = (sum/c) * d;
        System.out.println(result);


    }

    public static class BeerKegs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String biggest = "";
            double max = Double.MIN_VALUE;
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String model = scanner.nextLine();
                double radius = Double.parseDouble(scanner.nextLine());
                int height = Integer.parseInt(scanner.nextLine());
                double volume = Math.PI *radius * radius * height;
                if (volume> max){
                    max = volume;
                    biggest = model;

                }
            }
            System.out.println(biggest);
        }
    }
}
