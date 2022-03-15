package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int wagons[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[i] = people;
            sum+=people;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

//        for (int number: wagons) {
//            System.out.print(number + " ");
//        }

    }
}
