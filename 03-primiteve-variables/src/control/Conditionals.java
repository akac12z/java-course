package control;

public class Conditionals {
    public static void main(String[] args) {
        int age = 18;
        double average = 17.6;

        boolean isAdult = age > 18;
        boolean hasPassingGrade = average >= 16;

        if (age > 18 && average >= 17) {
            System.out.println("Es menor de edad");
        } else if (age < 0) {
            System.out.println("La edad no puede ser negativa men");
        } else {
            System.out.println("Es mayor de edad");
        }

        /*
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("No es lunes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            default:
                System.out.println("El dato que me has dado no existe");

        }
         */
    }
}
