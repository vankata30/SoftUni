package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int lineCount = 0;
        int longestSeqOf1= 0;
        int currentSeqOf1= 0;
        int currentLine = 0;
        int bestLineNum = 0;
        int seqIndexStart = 0;
        String input = scanner.nextLine();
        while (!input.equals("Clone them!")){
            int[] DNA = Arrays.stream(scanner.nextLine().split("!+")).mapToInt(Integer::parseInt).toArray();
            int[] bestLine = new int[DNA.length];
            lineCount++;
            for (int i = 1; i < DNA.length; i++) {
                if (DNA[i] == DNA[i-1] && DNA[i] == 1){
                    currentSeqOf1++;
                    if (currentSeqOf1>longestSeqOf1){
                        longestSeqOf1 = currentSeqOf1;
                        bestLineNum = lineCount;
                        seqIndexStart = i-1;
                        for (int j = 0; j < DNA.length; j++) {
                            bestLine[j] = DNA[j];
                        }
                    }
                } else {
                    break;
                }
            }

            input = scanner.nextLine();
            for (int i = 0; i < bestLine.length; i++) {
                System.out.print(bestLine[i]);
            }
        }

    }
}
