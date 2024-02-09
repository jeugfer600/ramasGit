package org.example;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("La resta de " + a + " - " + b + " es: " + resta(a, b));
    }

    public static int resta(int a, int b) {
        return a - b;
    }
}