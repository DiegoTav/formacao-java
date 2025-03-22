package etapa1_sintaxe_basica.modulo3_estruturas_repeticoes;

public class BreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break; // resultado se continue: 1 2 4 5
            }
            System.out.println(numero);
        }
    }

}
