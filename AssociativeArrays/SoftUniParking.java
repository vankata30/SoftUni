package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> users = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            switch (command) {
                case "register":
                    String plate = input.split(" ")[2];
                    if (!users.containsKey(username)) {
                        users.put(username, plate);
                        System.out.printf("%s registered %s successfully%n", username, plate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", users.get(username));
                    }
                    break;
                case "unregister":
                    if (users.containsKey(username)) {
                        users.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }

                    break;
            }
        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }


    }
}
