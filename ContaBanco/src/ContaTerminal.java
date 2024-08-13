import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        String nomeClienteConta;
        String agenciaConta;
        int numeroConta;


        System.out.println("Entre com o nome do cliente: ");
        nomeClienteConta = sc.nextLine();

        System.out.println("Entre com o número da agência: ");
        agenciaConta = sc.nextLine();

        System.out.println("Entre com o número da conta: ");
        numeroConta = sc.nextInt();

        boolean saldoValido = false;
        double saldoConta = 0;

        while (!saldoValido){
            System.out.println("Entre com o saldo da conta: ");
            if (sc.hasNextDouble()){
                saldoConta = sc.nextDouble();
                saldoValido = true;
            } else {
                System.out.println("Digite um saldo válido!");
                sc.next();
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo " +
                "%.2f já está disponível para saque", nomeClienteConta, agenciaConta, numeroConta, saldoConta);

        sc.close();
    }
}
