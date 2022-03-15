package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split( " "))
                .map(Integer ::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String commandLine = command.split(" ")[0];
            int value = Integer.parseInt(command.split(" ")[1]);
            if (commandLine.equals("Delete")){
                numList.removeAll(Arrays.asList(value));

            }else {
                int position = Integer.parseInt(command.split(" ")[2]);
                numList.add(position,value);
            }
            command = scanner.nextLine();
        }
        for (int num: numList){
            System.out.print(num+" ");
        }







    }
}
