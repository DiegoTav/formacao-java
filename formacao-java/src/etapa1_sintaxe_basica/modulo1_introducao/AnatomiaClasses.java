package etapa1_sintaxe_basica.modulo1_introducao;

public class AnatomiaClasses {
    public static void main(String[] args) {

        System.out.println("Ola, Mundo");
        // palavras reservadas
        final String PAIS = "Brasil";
        System.out.println(PAIS);

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
