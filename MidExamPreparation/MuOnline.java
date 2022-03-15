package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;
        boolean isDead = false;
        for (int i = 0; i < input.size(); i++) {
            String currentRoom = input.get(i);
            String command = currentRoom.split(" ")[0];
            int number = Integer.parseInt(currentRoom.split(" ")[1]);
            int healed = 0;
            if (isDead) {
                break;
            }
            switch (command){
                case "potion":
                    if (health + number > 100){
                        healed = 100 - health;
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", healed);
                    }else {
                        health+= number;
                        System.out.printf("You healed for %d hp.%n",number);
                    }
                    System.out.printf("Current health: %d hp.%n",health);

                    break;
                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n",number);

                    break;
                default:
                    health-=number;
                    if (health<=0){
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d%n",i+1);
                        isDead = true;
                        break;
                    }else {
                        System.out.printf("You slayed %s.%n",command);
                    }
                    break;
            }


        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitcoins);
            System.out.printf("Health: %d",health);
        }




    }
}
