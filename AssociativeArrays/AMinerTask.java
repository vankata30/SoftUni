package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        String text = scanner.nextLine();
        while (!text.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourceMap.containsKey(text)){
                resourceMap.put(text, resourceMap.get(text) + quantity);
            }else {
                resourceMap.put(text, quantity);
            }
            text = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }


    }
}
