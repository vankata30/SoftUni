package Lists;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> arrayList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        Collections.reverse(arrayList);
        String output = arrayList.toString().replaceAll("[\\]\\[,]", "").trim();
        output = output.replaceAll("\\s+", " ");

        System.out.println(output);

    }
}
