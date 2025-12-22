package staticMethos;

public class MathExample {

    // methods
    // los métodos estáticos (static) son los que PERTENECEN a una CLASE y NO a una INSTANCIA de esta. se pueden usar sin crear objetos. se usan por lo general para operaciones matemáticas o helpers, para resolver problemas comunes por ejemplo, sumar y restar cosas en este caso.
    // los métdodos estáticos se pueden llamar a través de un nombre_de_la_funcion.nombre_del_metodo (con el ".")
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subs(int num3, int num4) {
        return num3 - num4;
    }

    // aquellos métodos que no son estáticos no se pueden llamar desde el punto sino que teines que crear una instancia de esta clase para poder llamarlas, es decir: MathExample result = new MathExample; y habiéndo ehecho esto, ya puedes usar desde del result, a través del punto, aquel método que no era estático (ir al MainMath para verlo)
    public int mutiply (int num5, int num6) {
        return num5 * num6;
    }

    // los métodos en java aunque no sean static NO SE DUPLICAN en memoria vs los atributos que sí se duplican porque son únicos de cada clase o instancia de esta.
    // cada objeto o instancia tienes unas características propias (los atributos, como color de coche, matrícula, caballos) y distintas al resto pero los métodos, aquello que puede hacer (acelerar, frenar, girar...) es común a todos los objetos y clases y por ende, no tiene sentido duplicarlos

}
