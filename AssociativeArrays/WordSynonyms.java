package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!synonymMap.containsKey(word)) {
                synonymMap.put(word, new ArrayList<>());
                synonymMap.get(word).add(synonym);
            } else {
                synonymMap.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : synonymMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

        }


    }
}
