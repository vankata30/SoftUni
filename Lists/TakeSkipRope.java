package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        List<Integer> digits = new ArrayList<>();
        List<String> nonDigits = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            if (Character.isDigit(encryptedMessage.charAt(i))){
                digits.add(Integer.parseInt(String.valueOf(encryptedMessage.charAt(i))));
            }else{
                nonDigits.add(String.valueOf(encryptedMessage.charAt(i)));
            }
        }
        for (int i = 0; i < digits.size(); i++) {
            if (i%2 ==0){
                takeList.add(digits.get(i));
            } else {
                skipList.add(digits.get(i));
            }
        }
        int index = 0;
        for (int i = 0; i < digits.size(); i++) {

        }



    }
}
