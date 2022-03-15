package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstNum = input.split(" ")[0];
            String secondNum = input.split(" ")[1];

            if ((i + 1) % 2 == 1) {
                arr1[i] = firstNum;
                arr2[i] = secondNum;
            } else {
                arr1[i] = secondNum;
                arr2[i] = firstNum;
            }
        }
        for (String element : arr1) {
            System.out.print(element + " ");
        }

        System.out.println();
        for (String num : arr2) {
            System.out.print(num + " ");
        }


    }
}

