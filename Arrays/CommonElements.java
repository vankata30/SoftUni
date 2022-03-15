package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] array1 = firstLine.split(" ");
        String[] array2 = secondLine.split(" ");

        for (String element2 : array2){
            for (String element1 : array1) {
                if (element2.equals(element1)){
                    System.out.print(element2 + " ");
                }
            }
        }


    }
}
