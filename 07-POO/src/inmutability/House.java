package inmutability;

/*
* la inmutabilidad en clases significa que una vez creada una INSTANCIA de esa clase, SU ESTADO será INMUTABLE, es decir, YA NO SE PODRÁ CAMBIAR. TODOS los atributos permanecerán constantes durante la vida del objeto.
*
* para crear una clase inmutable en java teines que:
* 1. a la clase tienes que ponerla la palabra reservada final A LA CLASE
* 2. todos los atributos deben ser privados
* 3. además, todos los atributos tb deben ser constantes, es decir, tener la palabra final
* 4. tienes que inicializar los atributos pero A TRAVÉS DEL CONSTRUCTOR y no desde la propia inicialización ya que no podrías cambiarlos una vez les has dado un valor ahí arriba
* 5. no tener métodos setters para los atributos (no se pueden modificar)
*
* Las clases inmutables no puede ser SUPERCLASES (aunque house no sea el mejor ejemplo)
* */
public final class House {

    // attributes
    private final int doors;
    private final int windows;
    private final double size;

    // constructor
    public House (int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    // métodos setters
    public int getDoors(){
        return doors;
    }
    public int getWindows(){
        return windows;
    }
    public double getSize(){
        return size;
    }
}
