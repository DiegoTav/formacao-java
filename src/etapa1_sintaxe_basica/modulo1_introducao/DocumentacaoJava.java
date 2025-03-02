package etapa1_sintaxe_basica.modulo1_introducao;

/**
 * A classe {@code DocumentacaoJava} demonstra o uso do Javadoc em Java.
 * 
 * <p>Esta classe inclui exemplos de documentação para:
 * <ul>
 *   <li>Declaração de variáveis</li>
 *   <li>Métodos com parâmetros e retornos</li>
 *   <li>Comentários Javadoc</li>
 * </ul>
 * </p>
 * 
 * @author Diego TAvares
 * @version 1.0
 * @since 2025
 */
public class DocumentacaoJava {

    // Variável que armazena o nome do usuário
    private String nome;

    /**
     * Construtor da classe {@code DocumentacaoJava}.
     * 
     * @param nome Nome do usuário a ser armazenado na classe.
     */
    public DocumentacaoJava(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o nome armazenado.
     * 
     * @return O nome do usuário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define um novo nome para o usuário.
     * 
     * @param nome O novo nome do usuário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Exibe uma mensagem de boas-vindas personalizada.
     */
    public void exibirMensagem() {
        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo do Javadoc.");
    }

    /**
     * Método principal para executar o programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        DocumentacaoJava doc = new DocumentacaoJava("Usuário");
        doc.exibirMensagem();
    }
}
