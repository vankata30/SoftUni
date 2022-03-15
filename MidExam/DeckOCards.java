package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> deck = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split(", ")[0];
            switch (command) {
                case "Add":
                    String card = input.split(", ")[1];
                    if (deck.contains(card)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        deck.add(card);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    card = input.split(", ")[1];
                    if (deck.contains(card)) {
                        deck.remove(card);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }

                    break;
                case "Remove At":
                    int index = Integer.parseInt(input.split(", ")[1]);
                    if (index >= deck.size()) {
                        System.out.println("Index out of range");
                    } else {
                        deck.remove(index);
                        System.out.println("Card successfully removed");
                    }

                    break;
                case "Insert":
                    index = Integer.parseInt(input.split(", ")[1]);
                    card = input.split(", ")[2];
                    if (index >= deck.size() || index<0) {
                        System.out.println("Index out of range");
                    } else if (deck.contains(card)) {
                        System.out.println("Card is already added");
                    } else {
                        deck.add(index, card);
                        System.out.println("Card successfully added");
                    }

                    break;
            }
        }
        System.out.println(String.join(", ",deck));


    }
}
