public class Motorcycle extends Vehicle {
    // otra subclase de Vehículo
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar ) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // methods
    public void popWheelie() {
        System.out.println("Hiciste un caballito");
    }


}