package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int first = getNumber(scanner, "Ingrese el primer número");

        int second = getNumber(scanner, "Ingrese el segundo número");

        printArithmeticOperations(first, second);

        compareNumber(first, second);


    }
    public static int getNumber(Scanner scanner, String message){
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber ){
        System.out.println("La suma de a + b = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b = " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int first, int second){
        if(first>second){
            System.out.println("El primer número es mayor");
        }else{
            System.out.println("el segundo número es mayor o igual");
        }
    }
}