package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printGrade(Double.parseDouble(scanner.nextLine()));
    }

    private static void printGrade(double numberGrade) {
        if (numberGrade >=2 && numberGrade < 3){
            System.out.println("Fail");
        } else if (numberGrade <3.5){
            System.out.println("Poor");
        } else if (numberGrade < 4.5){
            System.out.println("Good");
        } else if (numberGrade< 5.5){
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
