package finalProject;
// esta es para manejar la lógica de la bank app
import java.util.Scanner;

// ES LA APP. AQUELLO CON LO QUE INTERACTÚAS (INTERFAZ) Y ES LO QUE TE PERMITE INTERACTUAR CON LA CUENTA DEL BANCO
public class BankApp {
    // atributos
    private BankAccount account; // un atributo privado del tipo BankAccount que se llama account
    private Scanner scanner;

    // constructor (debe tener el mismo nombre
    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    // métodos
    public void start() {
        // el único método público y este es el que llama a los métodos privados
        int option = 0;
        do {
            displayMenu();
            option = getUserOption();

            processOption(option);
        } while(option != 4);
    }

    private void displayMenu(){
    // creo uno privado porque solo lo voy a usar en la clase BankApp
        System.out.println("Selecciona opciones");
        System.out.println("1 - Depositar");
        System.out.println("2 - Retirar");
        System.out.println("3 - Mostrar saldo");
        System.out.println("4 - Salir");
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.print("Ingrese el monto a depositar");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    private void handleWithdraw(){
        System.out.println("Ingrese el saldo a retirar");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                handleDeposit();
                break;
            case 2:
                handleWithdraw();
                break;
            case 3:
                account.displayBalance();
                break;
            case 4:
                System.out.println("Gracias por utilizarnos.");
                break;
            default:
                System.out.println("Opción incorrecta.");

        }
    }
}
