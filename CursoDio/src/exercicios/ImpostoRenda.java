/*
Escreva um programa que calcule o imposto de renda com base no salário de uma pessoa.
Utilize a seguinte tabela de alíquotas:

Salário até R$1.500,00: isento
Salário entre R$1.500,01 e R$3.000,00: 10%
Salário entre R$3.000,01 e R$6.000,00: 15%
Salário acima de R$6.000,00: 20%
 */
package exercicios;

import java.util.Scanner;

public class ImpostoRenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Informe seu salário: ");
        salario = sc.nextDouble();

        if (salario <= 1500) {

            System.out.println("Isento");
        }
        else if (salario >= 1501 && salario <= 3000) {

            System.out.println("10%");
            imposto = salario * 0.1;
            System.out.println("vc irá pagar: R$ " + imposto);

        }
        else if (salario >= 3001 && salario <= 6000) {

            System.out.println("15%");
            imposto = salario * 0.15;
            System.out.println("Vc irá pagar: R$ %.2f " + imposto);
        }
        else {

            System.out.println("20%");
            imposto = salario * 0.20;
            System.out.printf("Vc irá pagar: R$ "+ imposto);
        }

    }
}
