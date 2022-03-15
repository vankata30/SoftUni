package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar!=' '){
                if (counts.containsKey(currentChar)){
                    counts.put(currentChar, counts.get(currentChar)+1);
                } else {
                    counts.put(currentChar,1);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
