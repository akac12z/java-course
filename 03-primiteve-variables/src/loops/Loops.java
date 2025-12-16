package loops;

public class Loops {
    public static void main(String[] args) {

        /*
        * como el número 5 es una constante y es una constante literal, es una mala práctica, tendríamos
        * que crear una contante para poder tenerlo
        * */

        final int MAX_VALUE = 5; // esto sería la buena práctica y no poner el 5 directo en el for

        for (int currentNumer = 0; currentNumer <= MAX_VALUE; currentNumer++) {
           System.out.println("Hello with value: " + currentNumer);
        }


        int counter = 0;
        int acumulator = 0;

        while(counter < 5) {
            System.out.println(counter);

            counter++; // si no pongo esto se creará un infinite loop porque counter siempre sería 0
            acumulator = acumulator+counter;
        }
            System.out.println(acumulator);

        int counter2 = 30;
        do {
            System.out.println("Counter2: " + counter2);
            counter2+=5; // la forma de sumar de 5 en 5 es += {{numero a sumar}}
        } while(counter2 <= 40);
    }
}
