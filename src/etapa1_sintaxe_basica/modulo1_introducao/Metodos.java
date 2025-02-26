package etapa1_sintaxe_basica.modulo1_introducao;

public class Metodos {

    // Método principal (main) - ponto de entrada do programa
    public static void main(String[] args) {
        saudacao(); // Chamada de um método sem retorno

        int soma = somar(10, 5); // Chamada de um método com retorno
        System.out.println("Resultado da soma: " + soma);

        exibirMensagem("Hello, Java!"); // Chamada de um método que recebe um parâmetro
    }

    // Método sem retorno (void) e sem parâmetros
    public static void saudacao() {
        System.out.println("Olá, bem-vindo ao estudo de métodos em Java!");
    }

    // Método com retorno (int) e dois parâmetros
    public static int somar(int a, int b) {
        return a + b; // Retorna a soma de dois números
    }                   

    // Método sem retorno, mas que recebe um parâmetro
    public static void exibirMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }

    // Método sobrecarregado (overload) - mesma assinatura com parâmetros diferentes
    public static int somar(int a, int b, int c) {
        return a + b + c; // Soma três valores
    }

    // Método recursivo - chama a si mesmo até atingir a condição de parada
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
