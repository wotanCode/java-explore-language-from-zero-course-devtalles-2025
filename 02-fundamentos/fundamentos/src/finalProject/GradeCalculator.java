package finalProject;

import java.util.Scanner;

/*
   1- Usuario: Ingresa edad y 3 calificaciones
   2- Calcular promedio de calificaciones
   3. Validar si aprobo o no base 6
 */
public class GradeCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do {
            System.out.println("Ingresa la edad");
            int age = scanner.nextInt();

            System.out.println("Ingresa 3 calificaciones");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();

            int sum = grade1 + grade2+ grade3;

            double average = sum/3.0;

            if (average >= 6){
                System.out.println("Aprobado " + "Edad " + age);
            }
            else {
                System.out.println("No aprobado " + "Edad " + age);
            }

            System.out.println("¿Desea ingresar nuevos datos? 1 para si, 0 para no");

            int option = scanner.nextInt();
            repeat = option == 1;

        } while (repeat);

        System.out.println("Programa finalizado");
        scanner.close();
    }
}
