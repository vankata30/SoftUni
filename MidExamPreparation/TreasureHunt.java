package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String commandLine = command.split(" ")[0];
            switch (commandLine) {
                case "Loot":
                    List<String> itemsToLoot = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                    for (int i = 1; i < itemsToLoot.size(); i++) {
                        if (!loot.contains(itemsToLoot.get(i))) {
                            loot.add(0, itemsToLoot.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    if (index >= 0 && index < loot.size()) {
                        String item = loot.get(index);
                        loot.remove(index);
                        loot.add(item);
                    }

                    break;
                case "Steal":
                    int count = Integer.parseInt(command.split(" ")[1]);
                    if (count > loot.size()) {
                        count = loot.size();
                    }
                    List<String> removedItems = new ArrayList<>();
                    for (int i = 0; i < count; i++) {
                       removedItems.add(loot.get(loot.size()-1));
                       loot.remove(loot.size()-1);
                    }
                    List<String> finalList = new ArrayList<>();
                    for (int i = 0; i < removedItems.size() ; i++) {
                        finalList.add(0,removedItems.get(i));
                    }
                    System.out.println(String.join(", ", finalList));

                    break;
            }


            command = scanner.nextLine();
        }
        double sum = 0;
        double average = 0;
        if (loot.size() != 0) {
            for (int i = 0; i < loot.size(); i++) {
                String currentTreasure = loot.get(i);
                sum += currentTreasure.length();
            }
            average = sum / loot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
