package etapa1_sintaxe_basica.modulo1_introducao.exercicios_praticos;

// === Exercicio pratico: "METODOS" ===

/* Criar uma classe para representar uma SmarTV onde:
 * 
 * Tenha caracteristicas: ligada (boolean), canal (int), volume (int);
 * Poderá ligar e desligar mudando o estado ligada;
 * Aumentará e Diminuirá o volume sempre em +1 ou -1;
 * Podera mudar de canal de 1 em 1 ou definindo o numero correspondente
 */ 

/* === Observacoes ===
 * 
 * Resposta proposta por mim a partir dos conteudos estudados 
 * até o momento e aprimorada usando IA
 */

public class SmartTV {

    private boolean taLigada = false;
    private int volume = 10; // Volume inicial
    private int canal = 1; // Canal inicial

    public static void main(String[] args) {
        SmartTV minhaTV = new SmartTV();

        // Exibir informações iniciais da TV
        minhaTV.exibirTV();

        // Testar algumas funções
        minhaTV.ligar();
        minhaTV.alterarVolume(10); // Aumenta o volume em 10 unidades
        minhaTV.escolherCanal(5); // Altera para o canal 5
        minhaTV.exibirTV();

        minhaTV.alterarVolume(-5); // Diminui o volume em 5 unidades
        minhaTV.alterarCanal(15); // Avança o canal em 15 unidades
        minhaTV.exibirTV();

        minhaTV.alterarCanal(-5); // retorna o canal em 5 unidades
        minhaTV.exibirTV();

        minhaTV.desligar();
        minhaTV.exibirTV();
    }

    // Método para exibir as configurações atuais da TV
    public void exibirTV() {
        System.out.println("\n===== STATUS DA TV =====");
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("Status: " + (taLigada ? "Ligada" : "Desligada"));
        System.out.println("========================");
    }

    // Método para ligar a TV
    public void ligar() {
        taLigada = true;
        System.out.println("A TV foi ligada.");
    }

    // Método para desligar a TV
    public void desligar() {
        taLigada = false;
        System.out.println("A TV foi desligada.");
    }

    // Método para alterar o volume em um valor específico
    public void alterarVolume(int valor) {
        volume += valor;
        System.out.println("Volume alterado para: " + volume);
    }

    // Método para avançar ou retornar canais
    public void alterarCanal(int valor) {
        if (valor < 0) {
            System.out.println("Você retornou " + Math.abs(valor) + " canal(is)");
        } else {
            System.out.println("Você avançou " + valor + " canal(is)");
        }

        canal += valor; // Atualiza o canal com o valor informado

        // Garante que o canal nunca seja menor que 1
        if (canal < 1) {
            canal = 1;
        }

        System.out.println("Seu canal atual agora é: " + canal);
    }

    // Método para alterar o canal em um valor específico
    public void escolherCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Número de canal inválido.");
        }
    }

}