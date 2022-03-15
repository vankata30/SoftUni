package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestSeqLength = 1;
        int currentSeqLength = 1;
        int longestSeqStart = 0;
        int currentSeqStart = 0;

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentSeqLength++;
            if (currentSeqLength > longestSeqLength) {
                longestSeqLength = currentSeqLength;
                longestSeqStart = currentSeqStart;
            }
            } else {
                currentSeqLength =1;
                currentSeqStart = i;
            }
        }
        for (int j = longestSeqStart; j < longestSeqStart+longestSeqLength; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
