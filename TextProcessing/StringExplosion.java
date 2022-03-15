package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder().append(scanner.nextLine());
        int bomb = 0;
        for (int i = 0; i < input.length(); i++) {


            if (bomb > 0 && input.charAt(i)!= '>'){
                input.deleteCharAt(i);
                bomb--;
                i--;

            } else if (input.charAt(i) == '>'){
                bomb += Integer.parseInt(String.valueOf(input.charAt(i+1)));
            }
        }
        System.out.println(input);


    }
}
