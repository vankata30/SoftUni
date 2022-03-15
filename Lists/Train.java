package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> listOfWagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("end")){

            String commandName = command.split(" ")[0];
            if (commandName.equals("Add")){
                int value = Integer.parseInt(command.split(" ")[1]);
                listOfWagons.add(value);
            } else {
                int value = Integer.parseInt(commandName);
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if (listOfWagons.get(i) + value <= capacity){
                        listOfWagons.set(i,listOfWagons.get(i)+value);
                        break;

                    }
                }



            }

            command = scanner.nextLine();
        }
        for (int num : listOfWagons){
            System.out.print(num + " ");
        }







    }
}
