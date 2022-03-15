package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSmallestNumber(a, b, c);


    }

    private static void printSmallestNumber(int a, int b, int c) {
        int smallestNum = 0;
        if (a<b){
           smallestNum = a;
        } else{
            smallestNum = b;
        }
        if (c<smallestNum){
            smallestNum = c;
        }
        System.out.println(smallestNum);
    }
}
