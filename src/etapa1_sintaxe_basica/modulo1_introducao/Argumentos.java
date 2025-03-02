package etapa1_sintaxe_basica.modulo1_introducao;

import java.util.Scanner;
// Classe para o estudo de terminal e algoritmos
// O codigo abaixo apresenta o uso do Scanner

public class Argumentos {
    public static void main(String[] args) {
        // Criação do Scanner para ler dados da entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        // Exemplo de leitura de uma string
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exemplo de leitura de um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Exemplo de leitura de um número de ponto flutuante
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Exibindo os dados fornecidos
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        // Fechando o scanner após o uso
        scanner.close();
    }
}
