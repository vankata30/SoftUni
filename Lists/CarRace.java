package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> race = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        double playerOneTime = 0;
        double playerTwoTime = 0;
        for (int i = 0; i < race.size() / 2; i++) {
            playerOneTime += race.get(i);
            if (race.get(i) == 0) {
                playerOneTime *= 0.8;
            }
        }
        for (int i = race.size() - 1; i > (race.size() / 2) ; i--) {
            playerTwoTime += race.get(i);
            if (race.get(i) == 0) {
                playerTwoTime *= 0.8;
            }
        }
        String winner = "";
        double winnerTime = Math.min(playerOneTime, playerTwoTime);
        if (winnerTime == playerOneTime) {
            winner = "left";
        } else {
            winner = "right";
        }
        System.out.printf("The winner is %s with total time: %.1f", winner, winnerTime);


    }
}
