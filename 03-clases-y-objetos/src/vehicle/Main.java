package vehicle;

public class Main {
    static void main() {
        Vehicle vehicle = new Vehicle("ford", "2000", 2000);
        vehicle.setYear(1900);
        System.out.println(vehicle.toString());
    }
}