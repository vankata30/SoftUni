package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequenceString = scanner.nextLine();
        List<String> sequence = new ArrayList<>(Arrays.asList(sequenceString.split(" ")));

        String input = scanner.nextLine();
        int count = 0;
        boolean hitAllMatches = false;
        while (!input.equals("end")) {

            List<String> integers = new ArrayList<String>(Arrays.asList(input.split(" ")));
            count++;
            int a = Math.min(Integer.parseInt(integers.get(0)), Integer.parseInt(integers.get(1)));
            int b = Math.max(Integer.parseInt(integers.get(0)), Integer.parseInt(integers.get(1)));

            if (a == b || a < 0 || b < 0 || a >= sequence.size() || b >= sequence.size()) {
                String penaltyElement = String.format("-%da", count);
                sequence.add(sequence.size() / 2, penaltyElement);
                sequence.add(sequence.size() / 2, penaltyElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {


                if (Objects.equals(sequence.get(a), sequence.get(b))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(a));

                    sequence.remove(b);
                    sequence.remove(a);

                } else {
                    System.out.println("Try again!");
                }
                if (sequence.size() == 0) {
                    hitAllMatches = true;
                    break;
                }
            }


            input = scanner.nextLine();
        }
        if (hitAllMatches) {
            System.out.printf("You have won in %d turns!%n", count);
        } else {
            System.out.println("Sorry you lose :(");
            for (String num :
                    sequence) {
                System.out.print(num + " ");
            }
        }


    }
}
