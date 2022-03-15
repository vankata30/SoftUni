package Methods;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstWorker = Integer.parseInt(scanner.nextLine());
        int secondWorker = Integer.parseInt(scanner.nextLine());
        int thirdWorker = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int totalStudentsPerHour = firstWorker + secondWorker + thirdWorker;
        int hours = 0;
       while (students>0){
           hours++;
           if (hours%4!=0) {
               students -= totalStudentsPerHour;
           }

       }
        System.out.printf("Time needed: %dh.",hours);

    }
}
