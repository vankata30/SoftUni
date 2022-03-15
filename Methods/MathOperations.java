package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + " ";
        }
        System.out.println(string);

    }
}
