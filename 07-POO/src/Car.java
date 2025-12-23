
// herencia: es la capacidad de una clase (subclase) de mantener características de otras clases (superclases)
// la herencia de clases SOLO PUEDE SER DE UNA ÚNCA CLASE. ES DECIR, SOLO PUEDES HEREDAR DE UNA SOLA CLASE A LA VEZ (Rubi permite herencias múltiples por ejemplo, Java no)
public class Car extends Vehicle {
    /*
    * la característica doors puedo no estar en todos los vehículos (motos) por ende, tiene sentido que esta característica no esté en la superclase Vehicle pero sí en la subclase como es Car
    * */
    private int doors;

    //constructor (de una subclase)
    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year); // asignamos los atributos que sean de la superclase a través de la palabra reservada super
        this.doors = doors; // y este como siempre, se asigna a doors
    }

    // métodos
    // getter y setter (solo de doors)
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

}
