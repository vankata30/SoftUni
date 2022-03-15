package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
        List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            int number = Integer.parseInt(commandLine.get(1));


           switch (command){
               case "Add":
                    numList.add(number);
                   break;
               case "Remove":
                    numList.remove(Integer.valueOf(number));
                   break;
               case "RemoveAt":
                    numList.remove(number);
                   break;
               case "Insert":
                   int index = Integer.parseInt(commandLine.get(2));
                    numList.add(index, number);
                   break;
           }


            input= scanner.nextLine();
        }

        for (int num:numList){
            System.out.print(num + " ");
        }

    }
}
