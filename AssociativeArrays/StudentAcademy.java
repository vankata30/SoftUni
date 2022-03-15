package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentMap.containsKey(student)) {
                double average = (studentMap.get(student) + grade) / 2;
                studentMap.put(student, average);

            } else {
                studentMap.put(student, grade);

            }
        }
        for (Map.Entry<String, Double> entry : studentMap.entrySet()) {
            if (entry.getValue()>=4.5){
                System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue());
            }
        }


    }
}
