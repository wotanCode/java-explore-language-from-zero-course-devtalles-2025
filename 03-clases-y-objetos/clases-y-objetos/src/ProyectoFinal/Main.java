package ProyectoFinal;

public class Main {
    static void main() {
        BankAccount bankAccount =
                new BankAccount("Juan Perez", 10000.0);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();
    }
}

