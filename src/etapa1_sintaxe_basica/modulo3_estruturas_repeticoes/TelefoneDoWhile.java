package etapa1_sintaxe_basica.modulo3_estruturas_repeticoes;

import java.util.Random;

public class TelefoneDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando... ");

        do {
            System.out.println("Telefone Tocando");
        } while (tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;

    }

}
