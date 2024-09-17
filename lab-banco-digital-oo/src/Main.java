public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente("12345", cliente1, 500);
        ContaPoupanca cp = new ContaPoupanca("67890", cliente1);

        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}