package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int index = Integer.parseInt(scanner.nextLine());
        int sum =0;
        while (list.size() > 0) {
            if(index==0 && list.size()==1){
                sum += list.get(0);
                list.remove(0);
                break;
            }
            if (index< 0){
                int removedValue = list.get(0);
                list.remove(0);
                list.add(0, list.get(list.size())-1);

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i)<= removedValue){
                        list.set(i, list.get(i)+ removedValue);

                    }else {
                        list.set(i, list.get(i)-removedValue);
                    }

                }
                sum += removedValue;
                index = Integer.parseInt(scanner.nextLine());
                continue;
            }else if (index > list.size()-1){
                int removedValue = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(list.get(0));
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i)<= removedValue){
                        list.set(i, list.get(i)+ removedValue);

                    }else {
                        list.set(i, list.get(i)-removedValue);
                    }

                }
                sum += removedValue;
                index = Integer.parseInt(scanner.nextLine());
                continue;
            }
            int removedValue = list.get(index);
            sum += removedValue;
            list.remove(index);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)<= removedValue){
                    list.set(i, list.get(i)+ removedValue);

                }else {
                    list.set(i, list.get(i)-removedValue);
                }

            }
            if (list.size()==0){
                break;
            }
            index= Integer.parseInt(scanner.nextLine());
        }

        System.out.println(sum);
    }
}
