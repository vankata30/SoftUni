package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String commandLine = command.split(" ")[0];
            int index = Integer.parseInt(command.split(" ")[1]);
            int value = Integer.parseInt(command.split(" ")[2]);
            switch (commandLine) {
                case "Shoot":
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - value);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index>=0 && index < targets.size()){
                        targets.add(index,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index + value < targets.size() && index - value >=0){
                        for (int i = index-value; i <= index + value ; i++) {
                            targets.remove(index-value);
                        }
                    }else{
                        System.out.println("Strike missed!");
                    }
                    break;

            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size()-1; i++) {
            System.out.print(targets.get(i) + "|");
        }
        System.out.println(targets.get(targets.size()-1));
    }
}
