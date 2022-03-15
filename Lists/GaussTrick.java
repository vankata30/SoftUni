package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int size = numbers.size();
        for (int i = 0; i < size /2; i++) {
            int firstNum = numbers.get(i);
            int secondNum = numbers.get(numbers.size() - 1);
            int sum = firstNum + secondNum;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);

        }
        for (int num: numbers){
            System.out.print(num + " ");
        }


    }


}
