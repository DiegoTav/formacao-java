package etapa1_sintaxe_basica.modulo1_introducao;

public class Operadores {
    public static void main(String[] args) {
        // === OPERADORES ARITMÉTICOS ===
        int a = 10, b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // === OPERADORES RELACIONAIS ===
        System.out.println("É maior? " + (a > b));
        System.out.println("É menor? " + (a < b));
        System.out.println("É igual? " + (a == b));
        System.out.println("É diferente? " + (a != b));

        // === OPERADORES LÓGICOS ===
        boolean x = true, y = false;
        System.out.println("AND lógico: " + (x && y));
        System.out.println("OR lógico: " + (x || y));
        System.out.println("NOT lógico: " + (!x));

        // === OPERADOR TERNÁRIO ===
        int idade = 20; // é uma expressao booleana
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);

        // === OPERADORES DE ATRIBUIÇÃO COMPOSTOS ===
        int numero = 10;
        numero += 5; // Equivale a numero = numero + 5
        System.out.println("Resultado += : " + numero);

        numero *= 2; // Equivale a numero = numero * 2 "numero = 30 * 2"
        System.out.println("Resultado *= : " + numero);
        
        // === OPERADORES BITWISE (BINÁRIOS) ===
        int bit1 = 5;  // Representação binária:  0101
        int bit2 = 3;  // Representação binária:  0011
        
        // Operador AND bitwise (&): retorna 1 apenas se ambos os bits forem 1
        System.out.println("AND bitwise: " + (bit1 & bit2)); // 0101 & 0011 = 0001 (decimal 1)
        
        // Operador OR bitwise (|): retorna 1 se pelo menos um dos bits for 1
        System.out.println("OR bitwise: " + (bit1 | bit2));  // 0101 | 0011 = 0111 (decimal 7)
        
        // Operador XOR bitwise (^): retorna 1 apenas se os bits forem diferentes
        System.out.println("XOR bitwise: " + (bit1 ^ bit2)); // 0101 ^ 0011 = 0110 (decimal 6)
    }
    

}
