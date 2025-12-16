package consts;

public class PracticeWithConst {
    public static void main(String[] args) {
        // par alas constantes, empiezan con final como palabra reservada
        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1- TAX_RATE);

        System.out.println("netSalary:" + netSalary);
    }
}
