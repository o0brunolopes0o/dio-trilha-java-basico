public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada acabou!");
    }

    private static double valorAleatorio() {
        return Math.random() * 10;
    }
}