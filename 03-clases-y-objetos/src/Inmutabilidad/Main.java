package Inmutabilidad;

public class Main {
    static void main() {
        House house = new House(2,3,10);
        System.out.println("house.getDoors() = " + house.getDoors());
    }
}