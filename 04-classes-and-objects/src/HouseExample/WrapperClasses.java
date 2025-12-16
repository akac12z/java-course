package HouseExample;

public class WrapperClasses {
    public static void main(String[] args) {
        // por cada dato primitivo (number) vas a tener un tipo de dato wrapper(Integer)
        /*
        * Los distintos tipos de wrappers (que son clases) son:
        * int -> Integer
        * double -> Double
        * boolean -> Boolean
        * char -> Character
        * byte -> Byte
        * short -> Short
        * long -> Long
        * float -> Float
        *
        * (solo cambian el int y el char, los demás solo son mayúsculas)
        *
        * los wrappers permiten usar datos primitivos donde solo se podrían usar Objetos
        * */

        int number = 10; // dato primitivo
        Integer number2 = 20; // clase
        Integer number3 = Integer.valueOf(20);


    }
}
