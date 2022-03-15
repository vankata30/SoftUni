package MidExamPreparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean lose = false;
        int count = 0;
        while (!input.equals("End of battle")){
            int distance =  Integer.parseInt(input);
            if ((distance>energy)){
                lose = true;
                break;
            }else {
                count++;
                energy-=distance;
                if (count % 3 == 0) {
                    energy+=count;
                }
            }
            input = scanner.nextLine();
        }
        if (lose){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",count,energy);
        }else {
            System.out.printf("Won battles: %d. Energy left: %d",count, energy);
        }





    }
}
