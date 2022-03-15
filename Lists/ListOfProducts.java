package Lists;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();

            productsList.add(product);
        }
        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n",i+1, productsList.get(i));
        }



    }
}
