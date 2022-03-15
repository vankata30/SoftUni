package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isValid = false;

        while (!isValid) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                String key = input[i + 1].toLowerCase();
                int value = Integer.parseInt(input[i]);

                if (key.equals("shards") || key.equals("fragments") || key.equals("motes")) {
                    materials.put(key, materials.get(key) + value);

                    if (materials.get(key) >= 250) {
                        materials.put(key, materials.get(key) - 250);

                        if (key.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (key.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isValid = true;
                        break;
                    }
                } else {
                    junk.put(key, !junk.containsKey(key) ? value : junk.get(key) + value);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }


        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }

    }
}

