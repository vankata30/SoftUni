package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> command = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombNumber = command.get(0);
        int power = command.get(1);
        int count = 0;
        while (numbers.contains(bombNumber)){
            int bombIndex = numbers.indexOf(bombNumber);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start<0){
                start =0;
            }
            if (end>= numbers.size()){
                end = numbers.size()-1;
            }

            for (int i = start; i <=end ; i++) {
                numbers.remove(start);

            }

        }
        int sum = 0;
        for (int num: numbers){
            sum+=num;
        }
        System.out.println(sum);








    }
}
