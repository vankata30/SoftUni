package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int shotTargets = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            int index = Integer.parseInt(command);
            if (index >= targets.size()){
                command = scanner.nextLine();
                continue;
            }
            if (targets.get(index)!= -1) {
                shotTargets++;
                int currentTarget = targets.get(index);
                targets.set(index,-1);
                for (int i = 0; i < targets.size(); i++) {
                    if (targets.get(i)>currentTarget && targets.get(i) != -1){
                        targets.set(i, targets.get(i) - currentTarget);
                    } else if (targets.get(i)<=currentTarget && targets.get(i) != -1){
                        targets.set(i, targets.get(i) + currentTarget);
                    }
                }
            }
            command= scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",shotTargets);
        for (int target :
                targets) {
            System.out.print(target+" ");
        }




    }
}
