package main;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: conhecer e importar a class scanner
        //TODO: exibir as mensagens para o nosso usuario
        //TODO: Obter da class scanner os valores digitados no terminal
        //TODO: exibir a mensagem criada

        Scanner read = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.print("Digite o número da conta: ");
        conta.setNumero(read.nextInt());
        System.out.print("Digite o número da agência: ");
        conta.setAgencia(read.next());
        System.out.print("Informe o nome do cliente: ");
        conta.setNomeCliente(read.next());
        System.out.print("Informe o saldo: ");
        conta.setSaldo(Double.parseDouble(read.next()));

        System.out.println("Conta:........" + conta.getNumero());
        System.out.println("Agência:......" + conta.getAgencia());
        System.out.println("Nome Cliente:." + conta.getNomeCliente());
        System.out.println("Saldo:........" + conta.getSaldo());

    }
}