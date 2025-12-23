package inmutability;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House(4, 4, 90.9);
        System.out.println(myHouse.getDoors());
    }
}
