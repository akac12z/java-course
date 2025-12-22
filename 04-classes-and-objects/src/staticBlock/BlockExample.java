package staticBlock;

public class BlockExample {

    // lo primero que se carga siempre serán los bloques estáticos y después toodo lo desmás, indistintamente de lo que sea, indistintamente de que sea el main o se cree el propio objeto se ejecutará el blosque estático
    public static void main(String[] args) {
        System.out.println("Hello 2");
    }

    static { // lo primero en ejecutarse va a ser esto porque es el métodoo static
        System.out.println("Hello");
    }
}
