package Strings;

public class Person {
    // atributos
    private String name;
    private String lastName;

    // MÉTODOS
    /* constructores
    * 1. constructor vacío
    * 2. constructor con atributos
    * */
    public Person() {

    }
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // getters y setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = name;
    }

    // método toString -> te devuelve los valores que tiene almacenados
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + "}";
    }

}
