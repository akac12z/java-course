package HouseExample;

public class House {

    // lo conveniente es que los atributos SIEMPRE sean privados (llevar la palabra private) y los métodos siempre PÚBLICOS

    // atributos (sin modificadores de acceso)
    /* mal asignados porque no son privados
    int doors;
    int windows;
    double size;
     */
    private int doors;
    private int windows;
    private double size;

    // atributos con modificadores de acceso
    private int sockets;
    public int lights; // sin restricciones
    protected int switches; // tendrá acceso aquellos que estén dentro del mismo paquete, clase o subclase


    // constructor sin parámetros
    public House() {

    }
    // constructor con parámetros
    public House(int doors, int windows, double size) {
        // this hace referencia al objeto actual en la clase en la que se encuentra
        // con this tb podemos saber cuál es el atributo (el del this.) y cuál es el parámetro (el que no lleva el this.)
        this.size = size;
        this.doors = doors;
        this.windows = windows;
    }

     /*
     getters y setters (siempre son públicos)
     getter retorna un valor de un atributo
     setter permite asignar o modificar un valor a la propiedad
     por cada atributo (como son privados) debe haber un setter y getter (para que el objeto pueda modificarlos (los suyos propios))
     */
    // getter de Doors
    public int getDoors() {
        return doors;
    }
    // setter de doors
    public void setDoors(int doors) {
        this.doors = doors;
    }
    // getter de windows
    public int getWindows() {
        return windows;
    }
    // setter de windows
    public void setWindows(int windows) {
        this.windows = windows;
    }
    // getter de size
    public double getSize() {
        return size;
    }
    // setter de size
    public void setSize(double size) {
        this.size = size;
    }
    // getter de sockets
    public int getSockets() {
        return sockets;
    }
    // setter de sockets
    public void setSockets(int sockets) {
        this.sockets = sockets;
    }
    // getter de lights
    public int getLights() {
        return lights;
    }
    // setter de lights
    public void setLights(int lights) {
        this.lights = lights;
    }
    // getter de switches
    public int getSwitches() {
        return switches;
    }
    // setter de switches
    public void setSwitches(int switches) {
        this.switches = switches;
    }




    // métodos (por lo general los métodos en las clases son públicos y hay que ponerlo de manera explícita)
    public void openDoor() {
        // no retorna nada (void) solo muestra el mensaje por pantalla
        System.out.println("La puerta está abierta");
    }

    public double calculateArea() {
        // este debe retornar (return) un double pq el atributo size era un double
        return size * size;
    }

    // el scope es el contexto de las variables
    // existen variables locales (aquellas que están declaradas en los objetos) y variables de clases (aquellas que están declaradas en la propia clase principal, en este caso sería door, windows..., los atributos) y variables estáticas

    /*
    * el ciclo de vida de las variables
    * - las variables locales: existen durante la ejecución del métdodo donde se declaran
    * - variables de instancia (las asociadas a las clases): existirán mientras la clase exista en memoria
    * - variables de clase: existen durante toda la vida del programa
    *
    * las variables de clase son aquellas variables que pertenecen a todas las instancias (los objetos creados a través de ella) de la clase
    * */
}
