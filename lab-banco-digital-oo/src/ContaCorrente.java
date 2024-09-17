public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limite;
        if (valor > 0 && valor <= saldoDisponivel) {
            super.sacar(valor); // Reutiliza o método sacar da classe base
        } else {
            System.out.println("Saldo insuficiente para saque, incluindo o limite.");
        }
    }
}