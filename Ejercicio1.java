/*1. Desarrollar un programa que permita leer múltiples valores numéricos hasta que el usuario decida detener
la lectura. Después, usará la colección TreeSet para mostrar el listado de los números ingresados ordenados
de menor a mayor. */

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        String opcion;

        do {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            numeros.add(num);
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("Números ingresados ordenados:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}