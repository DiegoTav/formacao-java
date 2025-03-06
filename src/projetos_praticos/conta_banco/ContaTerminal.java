package projetos_praticos.conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOla " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agencia eh: " + agencia +
                ", conta: " + numero + " e seu saldo: " + saldo + " ja esta disponivel para saque.");

        scanner.close();
    }
}
