package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, BiFunction<Integer, Integer, Integer>> menu = new HashMap<>();
        menu.put("suma", Main::suma);
        menu.put("resta", Main::resta);
        menu.put("multiplicacion", Main::multiplicacion);

        int num1 = 5;
        int num2 = 3;
        String opcion = "suma"; // Cambie esto para probar diferentes opciones

        BiFunction<Integer, Integer, Integer> operacion = menu.get(opcion);
        if (operacion != null) {
            int resultado = operacion.apply(num1, num2);
            System.out.println("El resultado de la " + opcion + " es: " + resultado);
        } else {
            System.out.println("Opción no válida");
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public float multiplicar (float a, float b){
        return a * b;
    }
}