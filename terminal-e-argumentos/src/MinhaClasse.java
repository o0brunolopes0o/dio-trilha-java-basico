import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua frase: ");
        String fraseEscrever = sc.nextLine();
        System.out.printf("A frase digitada foi: " + fraseEscrever);

        sc.close();
    }
}