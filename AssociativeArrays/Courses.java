package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if (!courses.containsKey(courseName)){
                List<String> currentCourse = new ArrayList<>();
                currentCourse.add(studentName);
                courses.put(courseName, currentCourse);
            } else {
                courses.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }


    }
}
