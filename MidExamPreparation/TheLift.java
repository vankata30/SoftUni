package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        List<Integer> wagonState = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int count = 0;
        int totalSeatsAvailable = wagonState.size() * 4;
        int peopleOnCurrentWagon = 0;
        boolean noMorePeople = false;
        int peopleOnTheLift = 0;
        for (int i = 0; i < wagonState.size(); i++) {

            while (wagonState.get(i) < 4) {
                wagonState.set(i, wagonState.get(i) + 1);
                peopleOnCurrentWagon++;
                if (peopleOnTheLift + peopleOnCurrentWagon == peopleWaiting) {
                    noMorePeople=true;
                    break;
                }


            }
            peopleOnTheLift+=peopleOnCurrentWagon;
            if (noMorePeople){
                break;
            }
            peopleOnCurrentWagon=0;
        }
            boolean isTrue = false;
        if (wagonState.size() > 1){

        }
            if (peopleOnTheLift < wagonState.size()*4){
                System.out.println("The lift has empty spots!");
                for (int num: wagonState){
                    System.out.print(num + " ");
                }
            } else if (peopleWaiting == peopleOnTheLift){
                for (int num: wagonState){
                    System.out.print(num + " ");
                }
            } else if (peopleWaiting > peopleOnTheLift){
                System.out.println("There isn't enough space! " + (peopleWaiting-peopleOnTheLift) + " people in a queue!");
                for (int num: wagonState){
                    System.out.print(num + " ");
                }
            }


    }
}
