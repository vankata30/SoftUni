package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))){
                list.set(i, list.get(i) + list.get(i+1));
                list.remove(i+1);
                i=-1;
            }
        }
        for (Double aDouble : list) {
            System.out.print(new DecimalFormat("0.#").format(aDouble)+ " ");
        }



    }
}
