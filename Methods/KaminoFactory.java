package Methods;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestSum = 0;
        int sequenceLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        int currentDNAPos = 0;
        int bestDNAPos = sequenceLength;
        String[] biggestSumArray = new String[sequenceLength];
        String[] sequence = new String[sequenceLength];
        String[] bestSequence = new String[sequenceLength];
        int countDNALines=0;
        int bestDNALine = 0;
        while (!input.equals("Clone them!")) {
            countDNALines++;
             sequence = input.split("!");
            int onesCount = countOnes(sequence);
            int currentSum = sumOnes(sequence);
            currentDNAPos = onesPos(sequence);
            if (currentSum > biggestSum && currentDNAPos < bestDNAPos){
                biggestSumArray = sequence;
                biggestSum = currentSum;
                bestDNALine = countDNALines;
            }
            if (onesCount >= max){
                max = onesCount;
                if (currentDNAPos < bestDNAPos){
                    bestSequence = sequence;
                    bestDNAPos = currentDNAPos;
                    biggestSum = currentSum;
                    bestDNALine = countDNALines;
                } else if (currentDNAPos == bestDNAPos){
                   bestSequence = biggestSumArray;



                }

            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestDNALine,biggestSum );
        for (String element:bestSequence) {
            System.out.print(element + " ");
        }
    }

    private static int sumOnes(String[] sequence) {
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i].equals("1")){
                sum++;
            }
        }
        return sum;

    }


    private static int onesPos(String[] sequence){

       int currentPosition = 0;
       int bestPosition = Integer.MAX_VALUE;
        for (int i = 0; i < sequence.length-1; i++) {
            if (sequence[i].equals("1") && sequence[i+1].equals("1")){
                currentPosition = i;
                if (currentPosition < bestPosition){
                    bestPosition = currentPosition;
                }

            }
        }
        return bestPosition;

    }

    private static int countOnes(String[] sequence) {
       int count = 1;
        for (int i = 0; i < sequence.length-1; i++) {
            if (sequence[i].equals("1") && sequence[i+1].equals("1")){
                count++;
            }
        }
        return count;
    }
}


