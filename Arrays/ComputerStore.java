package Arrays;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isValid = true;
        double totalWithoutTax=0;
        double totalWithTax = 0;
        double totalTax = 0;
        while (true){
            if (input.equals("special") ||input.equals("regular")){
                isValid = false;
                break;
            }
            double itemWithoutTax = Double.parseDouble(input);
            if (itemWithoutTax < 0){
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            double currentItemTax = itemWithoutTax * 0.2;
            totalWithoutTax += itemWithoutTax;
            totalTax+= currentItemTax;

            input = scanner.nextLine();
        }
        totalWithTax = totalTax + totalWithoutTax;
        if (totalWithTax == 0){
            System.out.println("Invalid order!");
        }else {
            if (input.equals("special")){
                totalWithTax *= 0.90;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalWithoutTax);
            System.out.printf("Taxes: %.2f$%n", totalTax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithTax);
        }
    }
}
