package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());


        int mostAttendances = 0;
        double maxBonus = Integer.MIN_VALUE;
        for (int i = 0; i <students ; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
           double totalBonus = studentAttendance * 1.0/lectures * (5 + bonus);
            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                mostAttendances = studentAttendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",mostAttendances);





    }
}
