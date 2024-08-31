import java.util.Scanner;

public class ExplorandoServicosTelefonia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = sc.nextLine().trim();


        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = sc.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Imprimindo o resultado
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }


        sc.close();
    }
}
