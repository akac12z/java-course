package finalProject;

import java.util.Scanner;

public class FinalProjectFile {
    public static void main(String[] args) {
        /*
        * EL proyecto consiste en:
        *
        * 1. pedir al usuario qué edad tiene y 3 calificaciones
        * 2. calcular el promedio de las calificaciones
        * 3. evaluar si el resultado es aprobado o no siendo average >= 6
        *
        * */
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        String name = "";
        int mathQualification = 0;
        int englishQualification = 0;
        int biologyQualification = 0;
        int average = 0;

        final int PASS_AVERAGE = 6;

        System.out.println("Hola, necesito que me digas tu nombre antes de continuar");
        name = scanner.nextLine();

        System.out.println("Ahora necesito tu edad");
        age = scanner.nextInt();

        System.out.println("Genial " + name + ". Veo que tienes " + age + " años. Ahora sigamos con las preguntas para evaluar tu desempeño.");

        System.out.println("Dime cuál fue la nota en mates");
        mathQualification = scanner.nextInt();

        System.out.println("Ahora la de ingles");
        englishQualification = scanner.nextInt();

        System.out.println("Y por último la de biología.");
        biologyQualification = scanner.nextInt();

        average = ((biologyQualification + englishQualification + mathQualification) / 3);

        System.out.println("Perfecto " + name + ", por lo que veo, tu media es de " + average);

        if (average >= PASS_AVERAGE) {
            System.out.println("Perfecto, men. Has pasado de curso porque la media para pasar es " + PASS_AVERAGE + " y has sacado un " + average);
        } else {
            System.out.println("Que pena, men. No has pasado porque la media para pasar es " + PASS_AVERAGE + " y has sacado un " + average);
            System.out.println();
        }
    }
}
