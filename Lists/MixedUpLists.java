package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();
        List<Integer> biggerList = new ArrayList<>();
        List<Integer> smallerList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            biggerList = firstList;
            smallerList = secondList;
        } else {
            biggerList = secondList;
            smallerList = firstList;
        }
        int i = 0;
        for (int j = 0; j < smallerList.size(); j++) {
            newList.add(firstList.get(j));
            newList.add(secondList.get(secondList.size() - 1 - j));
        }
        List<Integer> range = new ArrayList<>();
        if (firstList.size() > secondList.size()) {
            range.add(biggerList.get(smallerList.size()));
            range.add(biggerList.get(smallerList.size() + 1));
        } else {
            range.add(biggerList.get(0));
            range.add(biggerList.get(1));
        }

        int a = Math.min(range.get(0), range.get(1));
        int b = Math.max(range.get(0), range.get(1));

        for (int j = 0; j < newList.size(); j++) {
            if (newList.get(j) > a && newList.get(j) < b) {
                finalList.add(newList.get(j));
            }
        }
        Collections.sort(finalList);
        for (int num :
                finalList) {
            System.out.print(num + " ");
        }
    }
}
