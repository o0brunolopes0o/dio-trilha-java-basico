public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 31.0;

        if (saldo < valorSolicitado) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
    }
}