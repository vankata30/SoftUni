package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> playerOne = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
         List<Integer> playerTwo = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
         boolean playerOneWins = false;
        while (playerOne.size()>0 || playerTwo.size()>0){

                if (playerOne.get(0) > playerTwo.get(0)){
                    playerOne.add(playerOne.get(0));
                    playerOne.add(playerTwo.get(0));
                    playerOne.remove(0);
                    playerTwo.remove(0);
                } else if (playerOne.get(0) < playerTwo.get(0)) {
                    playerTwo.add(playerTwo.get(0));
                    playerTwo.add(playerOne.get(0));
                    playerTwo.remove(0);
                    playerOne.remove(0);
                } else {
                    playerOne.remove(0);
                    playerTwo.remove(0);
                }
                if (playerTwo.size()==0){
                    playerOneWins = true;
                    break;
                } else if (playerOne.size()==0){
                    break;
                }

        }
        int sum = 0;
        if (playerOneWins){
            for (int card : playerOne){
                sum+= card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int card : playerTwo) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
        
        


    }
}
