package staticBlock;

public class ConfigDB {

    // atributos
    /*
    Así no puedo acceder a ellas dentro de lal método static
    String URL;
    String USER;*/

    // :down así si podría
    static final String URL;
    static final String USER;

    // métodos
    static {
        // LOS BLOQUES ESTÁTICOS SE CARGAN UNA ÚNICA VEZ, CUANDO SE CARA LA CLASE Y YA
        // si quiero manejar dentro de bloques estáticos variables esta tb deben ser estáticas (tener la palabra static delante que es distinto a final que es una constante que no cambia valor ojo PERO SÍ sería útil y "obligado" ponerla porque al ejecutarse la primera vez y ya no poder cambiar nunca, debería tenerse claro que serán siempre fijas)
        // this.URL = ""; -> ESTA NO ES LA FORMA CORRECTA DE LLAMAR A ATRIBUTOS ESTÁTICOS
        URL = "htpps://c12z.io"; // forma correcta
        USER = "admin";

        System.out.println("Configuración cargada...");

        // SON ÚTILES PARA INICIALIZAR LAS VARIABLES ESTÁTICAS Y ORGANIZAR RECURSOS GLOBALES ÚTILES PARA EL USO DE LA APP Y SE EJECUTAN ANTES DE NADA (INCLUIDO EL MAIN) POR ESO
    }

    public static void main(String[] args) {
    System.out.println(URL);
    System.out.println(USER);
    }
    /*
    * los métodos main SIEMPRE deberán ser estáticos para evitar crear instancias innecesarias
    * */
}
