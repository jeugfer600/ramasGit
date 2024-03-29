package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Suma");
                    suma();
                    break;
                case 2:
                    System.out.println("Resta");
                    resta();
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    multiplicacion();
                    break;
                case 4:
                    System.out.println("Division");
                    division();
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu\n");
        sb.append("1. suma\n");
        sb.append("2. resta\n");
        sb.append("3. multiplicacion\n");
        sb.append("4. salir\n");
        System.out.println(sb.toString());
    }

    private static void suma() {
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("La suma es: " + (a + b));
    }

    private static void resta() {
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("La resta es: " + (a - b));
    }

    public static void  multiplicacion (){
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("La multiplicacion es: " + (a * b));
    }

    public static void division (){
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();
        System.out.println("La division es: " + (a / b));
    }

    public int modulo( int a, int b){
        return a%b;

    }
}