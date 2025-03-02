package etapa1_sintaxe_basica.modulo1_introducao; //Palavra reservada para definir pacotes

import java.util.Scanner; // Palavra reservada para importar classes

// Definição de uma classe
public class PalavrasReservadas {

    // Variáveis e modificadores de acesso
    private int idade;
    protected String nome;
    public static final double PI = 3.14159;

    // Construtor (usando "this" para referenciar o próprio objeto)
    public PalavrasReservadas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método que usa controle de fluxo
    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }
    }

    public static void main(String[] args) {
        // Criando um objeto usando "new"
        PalavrasReservadas pessoa = new PalavrasReservadas("João", 20);

        // Chamando o método
        pessoa.verificarIdade();
    }
}