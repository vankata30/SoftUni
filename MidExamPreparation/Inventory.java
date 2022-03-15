package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String commandLine = command.split(" - ")[0];
            String item = command.split(" - ")[1];
            switch (commandLine) {
                case "Collect":
                    if (!journal.contains(item)) {
                        journal.add(item);
                    }
                    break;
                case "Drop":
                    if (journal.contains(item)) {
                        journal.remove(item);
                    }
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (journal.contains(oldItem)) {
                        journal.add(journal.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (journal.contains(item)) {
                        journal.remove(item);
                        journal.add(item);
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", journal));


    }
}
