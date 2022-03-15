package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int index1 = 0;
        int index2 = 0;

        while (!command.equals("end")){
            String commandLine = command.split(" ")[0];
            switch (commandLine){
                case "swap":
                    index1 = Integer.parseInt(command.split(" ")[1]);
                    index2 = Integer.parseInt(command.split(" ")[2]);
                    int temp = numbers.get(index1);
                    numbers.set(index1, numbers.get(index2));
                    numbers.set(index2,temp);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(command.split(" ")[1]);
                    index2 = Integer.parseInt(command.split(" ")[2]);
                    numbers.set(index1, numbers.get(index1)* numbers.get(index2));
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i)-1);
                    }

                    break;


            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i)+ ", ");
        }
        System.out.print(numbers.get(numbers.size()-1));








    }
}
