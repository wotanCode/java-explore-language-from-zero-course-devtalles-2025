package com.devtalles.exception.basic;

public class DebuggingExample {
    public static void main(String[] args) {
        try {
            simulateError();
        } catch (Exception e) {
            System.out.println("Error detectado: " + e.getMessage());
            System.out.println("Detalles del error:");
            e.printStackTrace(); // Muestra el StackTrace completo
        }
    }

    public static void simulateError() {
        causeAnotherError();
    }

    public static void causeAnotherError() {
        throw new RuntimeException("Error crítico en la aplicación.");
    }
}