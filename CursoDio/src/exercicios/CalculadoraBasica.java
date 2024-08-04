/*
Escreva um programa que receba dois números e uma operação (adição, subtração, multiplicação ou divisão)
e use switch-case para executar a operação correspondente. O programa deve imprimir o resultado da operação.
 */
package exercicios;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, resultado;
        String operacao;

        System.out.println("Insira o n1: ");
        n1 = sc.nextDouble();
        System.out.println("Insira o n2: ");
        n2 = sc.nextDouble();
        sc.nextLine(); // consome a nova linha deixada pelo Double

        System.out.println("Insira o símbolo da operação desejada: ");
        operacao = sc.nextLine();

        resultado = 0;

        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        System.out.println(resultado);

    }
}
