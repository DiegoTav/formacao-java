package etapa1_sintaxe_basica.modulo3_estruturas_repeticoes;

import java.util.concurrent.ThreadLocalRandom;

public class ComprasWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {

            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce no valor " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Pedro gastou toda sua mesada em doces");
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
