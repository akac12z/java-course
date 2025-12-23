package relations;

public class House {

    // clases que estamos usando como atributos de otra clase (aquí hay una relación)
    private Room room; // son fuertes porque no existen sin la clase. a estas se les llama COMPOSICIÓN
    private Door door; // son fuertes porque no existen sin la clase House. a estas se les llama COMPOSICIÓN
    private Owner owner; // tienen una relación relativamente débil porque una puede existir sin la otra. a estas se les llama ASOCIACIÓN

    // constructor -> para inicializar
    public House (Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }


}
