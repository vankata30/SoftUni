package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(commandLine.get(1));
                    if (numList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = commandLine.get(1);
                    if (evenOrOdd.equals("even")) {
                        List<Integer> evenNumsList = findEvenNumbers(numList);
                        for (int num : evenNumsList) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    } else {
                        List<Integer> oddNumsList = findOddNumbers(numList);
                        for (int num : oddNumsList) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = getSum(numList);
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int num = Integer.parseInt(commandLine.get(2));
                    List<Integer> filteredList = getCondition(condition, num, numList);
                    for (int nums: filteredList){
                        System.out.print(nums + " ");
                    }
                    System.out.println();

                    break;
            }


            input = scanner.nextLine();
        }


    }

    private static List<Integer> getCondition(String condition, int num, List<Integer> numList) {
        List<Integer> filteredList = new ArrayList<>();
        switch (condition) {
            case "<":
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) < num) {
                        filteredList.add(numList.get(i));
                    }
                }
                break;
            case ">":
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) > num) {
                        filteredList.add(numList.get(i));
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) <= num) {
                        filteredList.add(numList.get(i));
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) >= num) {
                        filteredList.add(numList.get(i));
                    }
                }

                break;
        }


        return filteredList;
    }


    private static int getSum(List<Integer> numList) {
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        return sum;
    }

    private static List<Integer> findOddNumbers(List<Integer> numList) {
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 1) {
                oddList.add(numList.get(i));
            }
        }
        return oddList;
    }

    private static List<Integer> findEvenNumbers(List<Integer> numList) {
        List<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            int currentNum = numList.get(i);
            if (currentNum % 2 == 0) {
                evenList.add(numList.get(i));
            }
        }
        return evenList;

    }
}
