package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int currentPosition = 0;
        while (!command.equals("Love!")){
            int length = Integer.parseInt(command.split(" ")[1]);
            currentPosition +=length;
            if (currentPosition>neighbourhood.size()-1){
                currentPosition = 0;
            }
            if (neighbourhood.get(currentPosition) >=1){
                neighbourhood.set(currentPosition,neighbourhood.get(currentPosition)-2);
                if (neighbourhood.get(currentPosition )==0){
                    System.out.printf("Place %d has Valentine's day.%n",currentPosition);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n",currentPosition);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",currentPosition);
        boolean missionFailed = false;
        int failedHouses = 0;
        for (int i = 0; i < neighbourhood.size(); i++) {
            if (neighbourhood.get(i)!=0){
                failedHouses++;
                missionFailed = true;
            }
        }
        if (missionFailed){
            System.out.printf("Cupid has failed %d places.%n",failedHouses);
        }else {
            System.out.println("Mission was successful.");
        }


    }
}
