package etapa1_sintaxe_basica.modulo1_introducao;

// Classe demonstrativa sobre Tipos e Variáveis em Java
public class TiposVariaveis {
    public static void main(String[] args) {

        // === DECLARACAO DE VARIAVEIS PRIMITIVAS ===

        // Tipos inteiros
        byte idade = 26; // 8 bits (-128 a 127)
        short ano = 2025; // 16 bits (-32.768 a 32.767)
        int populacao = 214000000; // 32 bits (-2 bilhões a 2 bilhões)
        long distancia = 15000000000L; // 64 bits (necessário 'L' no final)

        // Tipos de ponto flutuante
        float altura = 1.75F; // 32 bits (necessário 'F' no final)
        double preco = 199.99; // 64 bits (padrão para valores decimais)

        // Tipo caractere
        char genero = 'M'; // Aspas simples para caracteres

        // Tipo booleano
        boolean ativo = true; // true ou false

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População: " + populacao);
        System.out.println("Distância: " + distancia);
        System.out.println("Altura: " + altura);
        System.out.println("Preço: " + preco);
        System.out.println("Gênero: " + genero);
        System.out.println("Usuário ativo: " + ativo);

        // === CASTING (CONVERSAO DE TIPOS) ===

        // Conversão implícita (Widening) - sem perda de dados
        int numero = 100;
        double numeroConvertido = numero; // int -> double automaticamente
        System.out.println("\nConversão implícita (int para double): " + numeroConvertido);

        // Conversão explícita (Narrowing) - pode haver perda de dados
        double temperatura = 36.8;
        int temperaturaInteira = (int) temperatura; // double -> int (perde a parte decimal)
        System.out.println("Conversão explícita (double para int): " + temperaturaInteira);

        // Conversão de String para número
        String textoNumero = "50";
        int numeroParseado = Integer.parseInt(textoNumero);
        System.out.println("Conversão de String para int: " + numeroParseado);

        // === CONSTANTES (VALORES IMUTAVEIS) ===

        final double PI = 3.14159; // Valor fixo, não pode ser alterado
        final int ANO_ATUAL = 2025;
        System.out.println("\nValor de PI: " + PI);
        System.out.println("Ano atual: " + ANO_ATUAL);
    }
}
