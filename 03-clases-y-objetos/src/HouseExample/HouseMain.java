package HouseExample;

public class HouseMain {
    static void main() {
        House myHouse = new House();
        myHouse.doors=10;
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(4,6,20);

        System.out.println("La cantidad de puertas de la casa es: " + myHouse2.getDoors());
        myHouse2.openDoor();
        double area = myHouse2.calculateArea();

        System.out.println("El área de la case es: " + area);

    }
}