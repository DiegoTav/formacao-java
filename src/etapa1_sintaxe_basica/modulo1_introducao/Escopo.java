package etapa1_sintaxe_basica.modulo1_introducao;

public class Escopo {

    // Variável de instância (Escopo de Classe)
    private String nome = "Diego";

    // Variável estática (Escopo de Classe compartilhado entre instâncias)
    private static int contador = 0;

    public void exibirNome() {
        // Escopo de Método (variável local)
        String sobrenome = "Tavares";

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    public void incrementarContador() {
        contador++; // Modificando variável estática (acessível em qualquer método)
        System.out.println("Contador: " + contador);
    }

    public void testarBloco(int idade) {
        if (idade >= 18) {
            // Variável com escopo de bloco
            String mensagem = "Você é maior de idade.";
            System.out.println(mensagem);
        }
        // System.out.println(mensagem); // Erro! "mensagem" não existe fora do bloco
    }

    public static void main(String[] args) {
        Escopo exemplo = new Escopo();

        exemplo.exibirNome();
        exemplo.incrementarContador();
        exemplo.incrementarContador();
        exemplo.testarBloco(20);
    }
}
