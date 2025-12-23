package staticMethos;

public class MainMath {
    public static void main(String[] args) {
        // accedemos a la clase a través de nombrarla directamente y no tenemos que hacer ningún import porque está dentro del mismo package
        int resultMathOperation  = MathExample.add(2,2);

        System.out.println("Result: " + resultMathOperation);

        // llamar al método multiply
        // newResul = MathExample.mutiply(4, 6); -> esto no funciona porque no es static
        MathExample result = new MathExample();
        result.mutiply(4,6);
    }
}
