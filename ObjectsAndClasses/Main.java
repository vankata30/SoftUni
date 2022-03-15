package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Student{
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        String input = scanner.nextLine();
        for (int i = 0; i < 3; i++) {

            String[] data = input.split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Student s1 = new Student(name, age);
            list.add(s1);
            input = scanner.nextLine();
        }

    }
}
