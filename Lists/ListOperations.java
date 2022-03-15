package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String commandLine = command.split("\\s+")[0];
            switch (commandLine) {
                case "Add":
                    int valueToAdd = Integer.parseInt(command.split("\\s+")[1]);
                    numList.add(valueToAdd);
                    break;
                case "Insert":
                    int valueToInsert = Integer.parseInt(command.split("\\s+")[1]);
                    int index = Integer.parseInt(command.split("\\s+")[2]);
                    if (index > numList.size() || index < 0) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numList.add(index, valueToInsert);
                    break;
                case "Remove":
                    int positionToRemove = Integer.parseInt(command.split("\\s+")[1]);
                    if (positionToRemove > numList.size() || positionToRemove < 0) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numList.remove(positionToRemove);

                    break;
                case "Shift":
                    String direction = command.split("\\s+")[1];
                    int number = Integer.parseInt(command.split("\\s+")[2]);
                    if (direction.equals("left")) {
                        for (int i = 0; i < number; i++) {
                            numList.add(numList.get(0));
                            numList.remove(0);
                        }
                    } else {
                        for (int i = 0; i < number; i++) {
                            numList.add(0, numList.get(numList.size() - 1));
                            numList.remove(numList.size() - 1);
                        }
                    }

                    break;

            }


            command = scanner.nextLine();
        }
        for (int num : numList) {
            System.out.print(num + " ");
        }

    }
}
