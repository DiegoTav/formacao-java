package etapa1_sintaxe_basica.modulo2_estruturas_condicionais;

public class BoletimTernario {
    public static void main(String[] args) {

        int nota = 7;
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        String resultado = nota >= 7 ? "Aprovado"
                : nota >= 5 && nota < 7 ? "Recuperação"
                        : "Reprovado";

        System.out.println(resultado);

    }

}
