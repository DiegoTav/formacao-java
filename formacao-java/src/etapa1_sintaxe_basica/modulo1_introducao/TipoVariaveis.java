package etapa1_sintaxe_basica.modulo1_introducao;

// === ANOTAÇÕES DO TÓPICO: TIPOS E VARIÁVEIS ===
public class TipoVariaveis {
    public static void main(String[] args) {

        // === TIPOS PRIMITIVOS ===
        
        // Tipos numéricos inteiros
        byte idade = 26;     // Ocupa 1 byte (8 bits), varia de -128 a 127
        short ano = 2025;    // Ocupa 2 bytes (16 bits), varia de -32.768 a 32.767
        int cep = 58202020;  // Ocupa 4 bytes (32 bits), valor padrão para números inteiros

        // Usar 'L' ou 'l' no final para indicar que o valor deve ser tratado como long
        long cpf = 26788324567L;  // Ocupa 8 bytes (64 bits), ideal para números grandes

        // Tipos numéricos de ponto flutuante
        // Usar 'F' ou 'f' no final para indicar que o valor deve ser tratado como float
        float pi = 3.14F;   // Ocupa 4 bytes (32 bits), menor precisão
        double salario = 3500.34; // Ocupa 8 bytes (64 bits), maior precisão

        // === CASTING (CONVERSÃO DE TIPOS) ===

        // Casting implícito (Widening) - de um tipo menor para um maior
        // Ocorre automaticamente, pois não há perda de dados
        int numeroInt = 10;
        double numeroDouble = numeroInt;  // Converte int para double automaticamente
        System.out.println("Número double (casting implícito): " + numeroDouble);

        // Casting explícito (Narrowing) - de um tipo maior para um menor
        // Necessário fazer manualmente, pois pode haver perda de informação (exemplo: parte decimal descartada)
        double preco = 9.99;
        int precoInteiro = (int) preco;  // Converte double para int manualmente
        System.out.println("Preço inteiro (casting explícito): " + precoInteiro);

        // Casting entre tipos incompatíveis diretamente - conversão de String para número
        // Para converter uma String em um número, usamos métodos específicos, como parseInt()
        String numeroTexto = "20";
        int numeroConvertido = Integer.parseInt(numeroTexto);  // Converte String para int
        System.out.println("Número convertido de String para int: " + numeroConvertido);
    }

    // === CONSTANTES ===
    
    /*
     * O modificador 'final' impede que o valor da variável seja alterado após a atribuição.
     * 
     * Convenção para constantes em Java:
     * - Usar nomes totalmente em MAIÚSCULAS.
     * - Separar palavras com underscore (_) se necessário.
     */
    public static final String PAIS = "Brasil";
    public static final double PI = 3.14159;
    public static final int ANO_ATUAL = 2025;
}

// Classe separada para constantes globais
class Config {
    /*
     * Se precisar de uma constante compartilhada por várias classes, 
     * use 'static final' dentro de uma classe separada.
     */
    public static final String PAIS = "Brasil";
}
