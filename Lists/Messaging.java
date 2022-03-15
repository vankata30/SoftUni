package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        List <Integer> newList = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            int currentNum = numList.get(i);
            int currentSum = 0;
            String numAsString = String.valueOf(currentNum);
            for (int j = 0; j <numAsString.length() ; j++) {
                int currentDigit = currentNum % 10;
                currentNum/=10;
                currentSum+=currentDigit;
            }
            newList.add(currentSum);
        }
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < newList.size(); i++) {
            int index = newList.get(i);
            if (index > input.length()){
                index -= input.length();
            }
            result.add(input.charAt(index));
            input = input.substring(0,index) + input.substring(index+1);
        }

        for (char ch : result){
            System.out.print(ch);
        }

    }
}
