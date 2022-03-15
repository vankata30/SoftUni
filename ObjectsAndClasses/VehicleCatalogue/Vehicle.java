package VehicleCatalogue;

public class Vehicle {
    String type;
    String model;
    String color;
    int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
       if (this.type.equals("car")){
           return String.format("Type: Car%nModel: %s%nColor: %s%nHorsepower: %s", this.model, this.color, this.horsepower);
       } else {
           return String.format("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %s", this.model, this.color, this.horsepower);
       }
    }
}
