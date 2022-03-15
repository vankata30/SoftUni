package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int commands = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
        String command = scanner.nextLine();
        String person = command.split(" ")[0];
        if (names.contains(person) && command.split(" ")[2].equals("going!")){
            System.out.println(person + " is already in the list!");
        } else if (!names.contains(person) && command.split(" ")[2].equals("going!")){
            names.add(person);
        } else if (names.contains(person) && command.split(" ")[2].equals("not")){
            names.remove(person);
        }else{
            System.out.println( person + " is not in the list!");
        }
        }
        for (String name:names) {
            System.out.println(name);
        }








    }
}
