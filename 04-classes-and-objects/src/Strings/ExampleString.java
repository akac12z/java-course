package Strings;

public class ExampleString {
    public static void main(String[] args) {
        /* El String es un arreglo de cadena de caracteres que funciona gracias al dato primitivo char.
        significa:
        * String str = "abc";
        * chat data[] = {'a', 'b', 'c'};
        * String str = new String(data);
        * */
        String name = "Chema"; // los String son inmutables
        String name2 = "Matisas";
        System.out.println(name == name2); // false
        String name3 = new String("Chema");

        System.out.println(name == name3); // false


        Person persona = new Person("Chema", "Ferrandez");
        System.out.println(persona.toString());
    }
}
