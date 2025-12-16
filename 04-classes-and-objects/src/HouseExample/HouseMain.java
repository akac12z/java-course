package HouseExample;

public class HouseMain {
    public static void main(String[] args) {

        // esto es un objeto de House
        House myHouse = new House(); // House() aquí es un constructor vacío porque no tiene parámetros
        /*
        al ser ahora clases privadas, esta manera no se puede hacer pq era mala práctica. ahora se tiene que hacer con los setter y getters (los atributos)
        myHouse.doors = 2;
        myHouse.windows = 4;
        myHouse.size = 10;*/

        // esta sería la forma correcta ahora. a través del método set
        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(20);

        // le pongo parámetros gracias a que ahora tengo el constuctor con parámetros
        House myHouse2 = new House(4, 5, 20); // House() aquí es un constructor vacío porque no tiene parámetros
        /*myHouse2.doors = 2;
        myHouse2.windows = 4;
        myHouse2.size = 10;*/

        System.out.println("La cantidad de puertas es: " + myHouse.getDoors()); // aquí como quiero mostra la cantidad de puertas y no quiero hacer nada más uso el get

        // mostrar el método que tenía como openDoor
        myHouse.openDoor();
        double area = myHouse.calculateArea();

        System.out.println("El área de la casa es: " + area+ "m^2");
    }
}
