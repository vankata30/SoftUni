package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsAmount = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Double> products = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("buy")){
            String item = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int amount = Integer.parseInt(input.split(" ")[2]);
            if (!productsPrice.containsKey(item)){
                productsPrice.put(item, price);
                productsAmount.put(item, amount);
            } else {
                productsPrice.put(item,price);
                productsAmount.put(item, amount + productsAmount.get(item));

            }

            products.put(item, 0.0);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsAmount.entrySet()) {
            productsPrice.put(entry.getKey(), entry.getValue() * productsPrice.get(entry.getKey()));

        }


        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }


    }
}
