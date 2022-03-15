package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printSign(number);


    }
    static void printSign(int number){
        if (number <0){
            System.out.println("The number " + number + " is negative.");
        } else if (number>0) {
            System.out.println("The number " + number + " is positive.");
        } else{
            System.out.println("The number " + number + " is zero.");
        }
    }
}
