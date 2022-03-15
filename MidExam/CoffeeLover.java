package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandLine = command.split(" ")[0];
            switch (commandLine){
                case "Include":
                    String coffeeToAdd = command.split(" ")[1];
                    coffees.add(coffeeToAdd);
                    break;
                case "Remove":
                    String firstOrLast = command.split(" ")[1];
                    int number =Integer.parseInt(command.split(" ")[2]);
                    if (number< coffees.size()){
                        switch (firstOrLast){
                            case "first":
                                for (int j = 0; j < number; j++) {
                                    coffees.remove(0);
                                }
                                break;
                            case "last":
                                for (int j = 0; j < number; j++) {
                                    coffees.remove(coffees.size()-1);
                                }
                                break;
                        }
                    }

                    break;
                case "Prefer":
                    int indexOne = Integer.parseInt(command.split(" ")[1]);
                    int indexTwo = Integer.parseInt(command.split(" ")[2]);
                    if (indexOne >=0 && indexTwo >=0 && indexOne<coffees.size() &&indexTwo < coffees.size()){
                        String coffeeAtIndexOne = coffees.get(indexOne);
                        coffees.set(indexOne,coffees.get(indexTwo));
                        coffees.set(indexTwo, coffeeAtIndexOne);
                    }

                    break;
                case "Reverse":
                    String tempList  = String.join(" ", coffees);
                    for (int j = 0; j < coffees.size() ; j++) {
                        coffees.set(j,tempList.split(" ")[coffees.size()-1-j]);
                    }

                    break;
            }
        }
        System.out.println("Coffees:");
        for (String coffee:coffees){
            System.out.print(coffee + " ");
        }







    }
}
