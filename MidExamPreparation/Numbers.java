package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> aboveAverage = new ArrayList<>();
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum * 1.0 / numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average){
             aboveAverage.add(numbers.get(i));
            }
        }
        aboveAverage.sort(Collections.reverseOrder());
        if (aboveAverage.isEmpty()){
            System.out.println("No");
        } else if (aboveAverage.size() <5){
            for (int num :aboveAverage) {
                System.out.print(num + " ");
            }
        }else {
            for (int i = 0; i < 5; i++) {
                System.out.print(aboveAverage.get(i)+ " ");
            }
        }


    }
}
