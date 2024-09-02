import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = sc.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        sc.close();
    }

    public static String verificarComboCompleto(String[] servicosContratados) {
        // Conjunto de serviços necessários para um combo completo
        Set<String> servicosNecessarios = new HashSet<>();
        servicosNecessarios.add("movel");
        servicosNecessarios.add("banda larga");
        servicosNecessarios.add("tv");

        // Conjunto de serviços contratados pelo cliente
        Set<String> servicosCliente = new HashSet<>();
        for (String servico : servicosContratados) {
            servicosCliente.add(servico.trim().toLowerCase());
        }

        // Verificando se todos os serviços necessários estão presentes
        if (servicosCliente.containsAll(servicosNecessarios)) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }
}