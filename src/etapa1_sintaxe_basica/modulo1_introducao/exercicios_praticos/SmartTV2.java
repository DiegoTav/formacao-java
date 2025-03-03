package etapa1_sintaxe_basica.modulo1_introducao.exercicios_praticos;

/* 
  Essa classe é uma versao atualizada e melhorada da Classe SmartTV

  Requisitos da TV:

  1.0. Liga e Desliga a TV

  2.0. Aumenta e diminui o volume
  2.1. O intervalo do volume vai de 0 a 100

  3.0. Incrementa e decrementa canais 
  3.1. Escolhe um canal especifico
  3.2. O intervalo dos canais vai de 0 a 100

*/

public class SmartTV2 {

    private boolean taLigada = false;
    private int volume = 10; // Intervalo do volume [0 até 100]
    private int canal = 1; // Intervalo dos canais [0 até 100]

    public static void main(String[] args) {

        SmartTV2 minhaTV = new SmartTV2();
        minhaTV.exibirTV();

        // Usando as funcoes da TV
        minhaTV.ligar();

        // Aumenta volume e Escolhe canal
        minhaTV.aumentarVolume(10);
        minhaTV.selecionaCanal(5);
        minhaTV.exibirTV();

        // Testa volume e canal com valores negativos
        minhaTV.dimunuirVolume(30);
        minhaTV.retornaCanal(30);
        minhaTV.exibirTV();

        // Testa volume e canal com valores muito altos
        minhaTV.aumentarVolume(130);
        minhaTV.avancaCanal(130);
        minhaTV.exibirTV();

        // Escolhe canal invalido
        minhaTV.selecionaCanal(120);
        minhaTV.exibirTV();

        minhaTV.desligar();

    }

    public void exibirTV() {
        System.out.println("\n===== STATUS DA TV =====");
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("Status: " + (taLigada ? "Ligada" : "Desligada"));
        System.out.println("========================\n");
        // System.out.println("===== ALTERACOES NA TV =====");
    }

    public void ligar() {
        taLigada = true;
        System.out.println("A TV foi ligada.");
    }

    public void desligar() {
        taLigada = false;
        System.out.println("A TV foi desligada.");
    }

    public void aumentarVolume(int valor) {
        volume += valor;
        System.out.println("Volume aumentado para: " + volume);

        // Garante que o volume nunca seja maior que 100
        if (volume > 100) {
            volume = 100;
        }

    }

    public void dimunuirVolume(int valor) {
        volume -= valor;
        System.out.println("Volume diminuido para: " + volume);

        // Garante que o volume nunca seja menor que 0
        if (volume < 0) {
            volume = 0;
        }

    }

    public void avancaCanal(int valor) {

        canal += valor;
        System.out.println("Você avancou " + canal + " canal(is)");

        /*
         * == usando operador ternario (expressao condicional): ==
         * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
         */

        // Cria um ciclo que retorna para o 1º canal sempre que o valor acrescido
        // ultrapassa o canal limite que é o canal 100

        if (canal > 100) {
            canal = (canal % 100 == 0) ? 1 : (canal % 100);
        }

    }

    public void retornaCanal(int valor) {
        canal -= valor;

        // Garante que o canal nunca seja menor que 1
        if (canal < 1) {
            canal = 1;
        }
        System.out.println("Você retornou para o canal: " + canal);
    }

    public void selecionaCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("O canal " + novoCanal + " é invalido. Selecione um canal entre 1 e 100");
        }

    }

}
