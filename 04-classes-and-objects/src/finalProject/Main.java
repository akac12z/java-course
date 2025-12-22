package finalProject;

public class Main {
    public static void main(String[] args) {

        /*
        * CREA LOS OBJETOS QUE NECESITAS
        * 1. LA CUENTA DEL BANCO, SIN ESTO NO PUEDES HACER NADA
        * 2. LA APP. SIN ESTA NO PUEDES CONTROLAR NADA DEL BANCO
        * 3. INICIALIZAS LA APP (A TRAVÉS DEL ÚNICO MÉTODO PÚBLICO)
        * */
        BankAccount bankAccount = new BankAccount("Chema", 200.00);
        BankApp bankApp = new BankApp(bankAccount);

        bankApp.start();
    }
}
