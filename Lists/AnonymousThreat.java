package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String line = scanner.nextLine();
        List<String> result = new ArrayList<>();
        while (!line.equals("3:1")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command){
                case "merge":
                    int start = Math.max(0, Integer.parseInt(data[1]));
                    int end = Math.min(Integer.parseInt(data[2]), strings.size());
                    for (int i = 0; i < start; i++) {
                        result.add(strings.get(i));
                    }
                    String merged = "";
                    for (int i = start; i <=end; i++) {
                        merged+=strings.get(i);
                    }
                    result.add(merged);
                    for (int i = end; i < strings.size()-1; i++) {
                        result.add(strings.get(i));
                    }
                    System.out.println(result);
                    break;
                case "divide":


                    break;
            }

            strings = result;
            line = scanner.nextLine();
        }


    }
}
