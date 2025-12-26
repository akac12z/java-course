//esta va a ser una clase con polimorfismo
public class PolymorphismVehicle {
    // atributos
    private String brand;
    private String model;
    private int year;

    //constructor
    public PolymorphismVehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //métodos
    public void start() { System.out.println("Arrancado!"); }
    public void stop() { System.out.println("Parado!"); }

    // métodos con polimorfismo de sobrecarga (en tiempo de compilación)
    /*
    *  puedes tener un mismo method pero ahora sobrecargado (le pasas unos parámetros) y además, puedes tener el mismo method pero cambiando el tipo de parámetro
    * los métodos de la sobre carga deben ser de distinto tipo, es decir, aunque tengan el mismo nombre, no pueden ser los dos int o boolean o String o double...
    * */
    public void start(boolean silentMode) {
        if(silentMode) {
            System.out.println("SILENT MODE: ON");
        } else {
            System.out.println("SILENT MODE: OFF");
        }
    }
    public void start(int silentMode) { System.out.println("Arrancado!"); }


    //getter y setter brand
    public String getBrand() {
        return  brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //getter y seter model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // getter y setter de year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        // tienes que tener validaciones para que no pueda poner 5000
        int currentYear = java.time.Year.now().getValue(); // esto me da el valor del año actual en el que estamos
        // validación del año
        if (year < 1885 || year > currentYear + 2) {
            // System.out.println("El año no es válido.");
            throw new IllegalArgumentException("Año inválido"); // para lanzar un error y cuando esto se lanza, el programa para y no se ejecuta aquello que haya siguiente al error
        }
        this.year = year;
    }
}