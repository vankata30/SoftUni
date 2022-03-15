package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();
        Map<String, List<String>> sideTwo = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            String delimiter = input.split(" ")[1];
            if (delimiter.equals("|")) {
                String side = input.split("|")[0].trim();
                String user = input.split("|")[1].trim();
                if (!map.containsKey(side)){
                    List<String> currentUsers = new ArrayList<>();
                    currentUsers.add(user);
                    map.put(side,currentUsers);
                }
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().equals(user)){

                    }
                }


            } else if (delimiter.equals("->")) {

            }


            input = scanner.nextLine();
        }


    }
}
