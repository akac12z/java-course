package relations;

public class Person {

    // aquí hay una dependencia de la clase Person a Calculator (se llama relación de dependencia)
    // el beneficio está en que añadas lo que añadas a la clase claculator, puedes tener todos esos métodos en la clase a la cual hayas añadido como parámetro Calculator
    public void calculateAdd (Calculator calculator) {
        int result = calculator.add(5, 3);
        System.out.println("Suma = " + result);
    }
}
