package poo;

public class Main {
    public static void main(String[] args) {

        /*poo.Vehicle vehicle = new poo.Vehicle("Fiat", "Duna", 2000);

        vehicle.setYear(2001);

        System.out.println(vehicle.toString());*/

        Vehicle myMar =
                new Car("Toyota", "Corolla", 2022, 4);
        Vehicle motorcycle =
                new Motorcycle("Honda", "CBR", 2021, false);

        ((Motorcycle)motorcycle).start();
        ((Car)myMar).start();

        ((Car)myMar).setDoors(10);

        printVehicle(motorcycle);
        printVehicle(myMar);
    }

    public static void printVehicle(Vehicle vehicle){
        System.out.println(vehicle.toString());
    }
}