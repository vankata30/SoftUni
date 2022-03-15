package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;

        for (String line: input){
            double modifiedNum = 0;
            char firstLetter = line.charAt(0);
            char secondLetter = line.charAt(line.length()-1);
            int num = Integer.parseInt(line.substring(1,line.length()-1));
            if (Character.isUpperCase(firstLetter)){
                modifiedNum += num*1.0/ (firstLetter-64);
            } else if (Character.isLowerCase(firstLetter)){
                modifiedNum+= num *1.0 * (firstLetter-96);
            } if (Character.isUpperCase(secondLetter)){
                modifiedNum-= secondLetter-64;
            } else if (Character.isLowerCase(secondLetter)){
                modifiedNum += secondLetter -96;
            }

            totalSum += modifiedNum;
        }

        System.out.printf("%.2f",totalSum);

    }
}
