package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public String getAge() {
            return this.age;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {
            boolean isOverwritten = false;
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            String age = data[2];
            String town = data[3];

            Student student = new Student(firstName, lastName, age, town);
            for (int i = 0; i < studentList.size(); i++) {
                Student currentStudent = studentList.get(i);
                if (currentStudent.firstName.equals(firstName) && currentStudent.lastName.equals(lastName)){
                    studentList.set(i,student);
                    isOverwritten = true;
                }
            }
            if (!isOverwritten) {
                studentList.add(student);
            }
            input = scanner.nextLine();
        }

        String searchTown = scanner.nextLine();
        for (Student student : studentList) {
            if (student.town.equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", student.firstName, student.lastName
                        , student.age);
            }
        }
    }
}
