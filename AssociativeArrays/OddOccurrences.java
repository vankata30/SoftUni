package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for (String word : wordsList) {
            String wordInlowerCase = word.toLowerCase();
            if (count.containsKey(wordInlowerCase)) {
                count.put(wordInlowerCase, count.get(wordInlowerCase) + 1);
            } else {
                count.put(wordInlowerCase,1);
            }
        }
        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue()%2 != 0){
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));

    }
}
