package finalProject;

// GESTIONA LO QUE TIENE QUE VER CON LA CUENTA DEL BANCO: AQUELLO QUE PUEDES HACER CON LA CUANTA DEL BANCO COMO DEPOSITAR, RETIRAR O VER SALDO
public class BankAccount {

    // atributos que puede tener la cuenta de banco
    private String accountHolder;
    private double balance;

    // constructor para la cuenta de banco
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // métodos de la accountBank

    // para depositar
    public void deposit(double amount) {
        if(amount > 0 ) {
            balance = balance + amount;
            // balance += amount // sería lo mismo
            System.out.println("Tu saldo " + amount + " ha sido añadido.");
        } else {
            System.out.println("Tienes que añadir un saldo superior a cero");
        }
    }

    // para extraer
    public void withdraw(double amount) {
        if ( amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Operación realizada. Has retirado: $" + amount);
        } else if ( amount < 0 ) {
            System.out.println("El monto debe ser mayor a cero");
        } else {
            System.out.println("No tienes saldo suficiente. Estás intentando retirar $" + amount + " y tu saldo es $" + balance);
        }
    }

    // para mostrar por pantalla
    public void displayBalance() {
        System.out.println("Saldo: " + balance);
    }


}
