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

        numero *= 2; // Equivale a numero = numero * 2
        System.out.println("Resultado *= : " + numero);

        // === OPERADORES BITWISE (BINÁRIOS) ===
        int bit1 = 5;  // 0101 em binário
        int bit2 = 3;  // 0011 em binário
        System.out.println("AND bitwise: " + (bit1 & bit2)); // 0001 -> 1
        System.out.println("OR bitwise: " + (bit1 | bit2));  // 0111 -> 7
        System.out.println("XOR bitwise: " + (bit1 ^ bit2)); // 0110 -> 6
    }
    

}
