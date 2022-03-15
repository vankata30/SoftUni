package MidExamPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean warShipSunk = false;
        boolean pirateShipSunk = false;
        while (!command.equals("Retire")) {
            String commandLine = command.split(" ")[0];
            switch (commandLine) {
                case "Fire":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int damage = Integer.parseInt(command.split(" ")[2]);
                    if (index >= 0 && index < warShip.size()) {
                        warShip.set(index, warShip.get(index) - damage);
                        if (warShip.get(index) <= 0) {
                            warShipSunk = true;
                            break;
                        }

                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int endIndex = Integer.parseInt(command.split(" ")[2]);
                    int damages = Integer.parseInt(command.split(" ")[3]);
                    if (startIndex >= 0 && startIndex < pirateShip.size()
                            && endIndex >= 0 && endIndex < pirateShip.size()) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip.set(i, pirateShip.get(i) - damages);
                            if (pirateShip.get(i) <= 0) {
                                pirateShipSunk = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(command.split(" ")[1]);
                    int health = Integer.parseInt(command.split(" ")[2]);
                    if (index >= 0 && index < warShip.size()) {
                        pirateShip.set(index, pirateShip.get(index) + health);
                        if (pirateShip.get(index) > maxHealth) {
                            pirateShip.set(index, maxHealth);
                        }
                    }

                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < maxHealth * 0.2) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }


            command = scanner.nextLine();
        }

        if (warShipSunk) {
            System.out.println("You won! The enemy ship has sunken.");
        } else if (pirateShipSunk) {
            System.out.println("You lost! The pirate ship has sunken.");
        } else {
            int pirateSum = 0;
            int warShipSum = 0;
            for (int section : pirateShip) {
                pirateSum += section;
            }
            for (int section : warShip) {
                warShipSum += section;
            }
            System.out.printf("Pirate ship status: %d%n", pirateSum);
            System.out.printf("Warship status: %d%n", warShipSum);


        }
    }
}
