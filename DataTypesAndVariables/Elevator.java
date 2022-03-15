package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int capacity = scanner.nextInt();

        int courses = people/ capacity;
        people -= courses*capacity;
        if (people<=capacity & people >0){
            courses++;
        }

        System.out.println(courses);

    }
}
