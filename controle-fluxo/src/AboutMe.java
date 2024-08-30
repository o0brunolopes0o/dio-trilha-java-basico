import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
            Locale.setDefault(new Locale("en", "US"));
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite a sua altura: ");
            double  altura = sc.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");

            sc.close();

        } catch (InputMismatchException exception) {
            System.out.println("Os campos idade e altura devem ser numéricos!");
        }

    }
}
