public class Main {
    public static void main(String[] args) {
        /* instancia de vehículo (tengo que pasarle las props al vehículo ya que no las he puesto privadas)
        * poder hacer esto es mala práctica porque estás exponiendo las variables de la clase dando permiso a cualquiera para modificarlas a su antojo pudiendo poner:
        * newTesla.brand = "Toyota"; // ¡Cambió la marca!
        * newTesla.model = null; // ¡Asignó null!
        * newTesla.year = -5000; // Puso un año inventado
        *
        * por tanto, esto conlleva varios problemas:
        * 1. Falta de validación Sin control, alguien puede asignar datos inválidos
        * 2. Cambios inesperados Si en el futuro necesitas que cambiar el brand, por ejemplo, actualice también otras cosas, no puedes hacerlo si la propiedad es pública
        * 3. Difícil de mantener Los cambios internos rompen el código cliente
        * */

        // -> si pongo los métodos priovados ya no podré cambiar los atributos de la forma que yo quiera
        // con los métodos privados toda hacerlo como abajo
        Vehicle newTesla = new Vehicle("Tesla", "3", 2022);
        newTesla.setYear(9990); // esto lanza un error porque tiene que ser un currentYear + 2
    }
}