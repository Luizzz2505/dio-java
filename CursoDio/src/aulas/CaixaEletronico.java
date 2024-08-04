package aulas;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorSolicitado, saldo, saldoAtual;

        System.out.println("Informe quanto vc possui na sua conta: ");
        saldo = sc.nextDouble();

        System.out.println("Informe quanto vc quer tirar: ");
        valorSolicitado = sc.nextDouble();

         if (valorSolicitado <= saldo) {

             System.out.println("Saque aprovado.");

         }

         else {

            System.out.println("Saque negado.");

        }

        saldoAtual = saldo - valorSolicitado;

        System.out.println("Seu saldo: " + saldoAtual);
    }
}
