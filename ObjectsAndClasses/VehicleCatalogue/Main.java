package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> catalogue = new ArrayList<>();
        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            catalogue.add(vehicle);

            input = scanner.nextLine();
        }
        String searchModel = scanner.nextLine();
        while (!searchModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : catalogue) {
                if (vehicle.model.equals(searchModel)) {
                    System.out.println(vehicle);
                }
            }

            searchModel = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageCar(catalogue));
        System.out.printf("Trucks have average horsepower of: %.2f.%n", getAverageTruck(catalogue));


    }

    private static double getAverageCar(List<Vehicle> catalogue) {
        double sum = 0;
        int count = 0;
        for (Vehicle vehicle : catalogue) {
            if (vehicle.type.equals("car")) {
                sum += vehicle.horsepower;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    private static double getAverageTruck(List<Vehicle> catalogue) {
        double sum = 0;
        int count = 0;
        for (Vehicle vehicle : catalogue) {
            if (vehicle.type.equals("truck")) {
                sum += vehicle.horsepower;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}