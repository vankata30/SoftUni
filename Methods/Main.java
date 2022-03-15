package Methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double firstNum = Double.parseDouble(scanner.nextLine());
//       String line = scanner.nextLine();
//        double secondNum = Double.parseDouble(scanner.nextLine());
//        char operator = line.charAt(0);
//
//        System.out.println(calculate(firstNum,secondNum,operator));

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int[] array = new int[] {a,b,c};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }

    private static double calculate(double firstNum, double secondNum, char operator) {

        double result =0;
        switch (operator){
            case '/':
                result = firstNum/secondNum;
                break;
            case '*':
                result = firstNum*secondNum;
                break;
            case '+':
                result = firstNum+ secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
        }
        return result;

    }
}

