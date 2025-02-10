// Anotações do Topico: Anatomia de classes

public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Ola, Mundo");

        // Final indica que nao pode ser alterada, nome todo em caixa alta.
        final String BR = "Brasil";
        System.out.println(BR);

        // Estudadando metodos
        String primeiroNome = "Diego";
        String segundooNome = "Tavares";

        String nomeCompleto = nomeCompleto(primeiroNome, segundooNome);
        System.out.println(nomeCompleto);

    }

    // Metodo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
