package scannerExam;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        /*
        // para crear un nuevo objeto necesitamos tener el operador new
        System.out.println("vamos a realizar una operación de división");

        System.out.println("ingresa el primer número, men");
        Scanner sc = new Scanner(System.in); // esto es una instancia de una clase
        int a = sc.nextInt(); // este méthod permite ingresar un número entero al user desde el teclado

        System.out.println("ahora el segundo");
        int b = sc.nextInt(); // este méthod permite ingresar un número entero al user desde el teclado

        System.out.println("La división da: " + a/b);
        */

        // Refactorizando scanner
        System.out.println("vamos a realizar una operación de división");

        System.out.println("ingresa el primer número, men");
        Scanner scanner = new Scanner(System.in); // esto es una instancia de una clase
        int firstNumber = scanner.nextInt(); // este méthod permite ingresar un número entero al user desde el teclado

        System.out.println("ahora el segundo");
        int secondNumber = scanner.nextInt(); // este méthod permite ingresar un número entero al user desde el teclado

        int division = firstNumber/secondNumber;

        System.out.println("La división da: " + division);
    }
}
