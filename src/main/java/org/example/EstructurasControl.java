package org.example;

import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🔹 1. ESTRUCTURA CONDICIONAL IF-ELSE
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println(" Eres mayor de edad.");
        } else {
            System.out.println(" Eres menor de edad.");
        }

        // 🔹 2. ESTRUCTURA SWITCH-CASE
        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: System.out.println("Elegiste la opción 1."); break;
            case 2: System.out.println("Elegiste la opción 2."); break;
            case 3: System.out.println("Elegiste la opción 3."); break;
            default: System.out.println("Opción no válida.");
        }

        // 🔹 3. BUCLE FOR
        System.out.println("Contando del 1 al 5 con FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // 🔹 4. BUCLE WHILE
        System.out.println(" Contando del 5 al 1 con WHILE:");
        int j = 5;
        while (j >= 1) {
            System.out.println("Número: " + j);
            j--;
        }

        // 🔹 5. BUCLE DO-WHILE
        System.out.println("Contando del 1 al 3 con DO-WHILE:");
        int k = 1;
        do {
            System.out.println("Número: " + k);
            k++;
        } while (k <= 3);

        scanner.close(); // Cerrar el scanner
    }
}
