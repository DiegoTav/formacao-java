package etapa1_sintaxe_basica.modulo3_estruturas_repeticoes;

public class EstudantesArray {
    public static void main(String[] args) {
        String estudantes[] = { "DIEGO", "RAFAEL", "ISLAN", "MADRUGA" };

        // for (int x = 0; x < estudantes.length; x++) {

        // System.out.println("O estudadnte no indice x = " + x + " é " +
        // estudantes[x]);}

        for (String estudante : estudantes) {
            System.out.println("O nome do estudante é " + estudante);

        }

    }

}
