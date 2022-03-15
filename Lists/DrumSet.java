package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean isBroke = false;
        List<Integer> initialList = new ArrayList<>(drumSet);
        String command = scanner.nextLine();
        while (!command.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(command);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - power);
                if (drumSet.get(i) <=0){
                    if (savings >= initialList.get(i) * 3) {
                        drumSet.set(i, initialList.get(i));
                        savings = savings - initialList.get(i) * 3;
                    } else {
                       drumSet.remove(i);
                       initialList.remove(i);
                       i--;
                    }

                }
            }


            command = scanner.nextLine();
        }
            for (int drum : drumSet){
                System.out.print(drum + " ");
            }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",savings);

    }
}
