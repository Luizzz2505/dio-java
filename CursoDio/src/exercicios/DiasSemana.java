/*
Escreva um programa que receba um número de 1 a 7 e use switch-case para imprimir
o nome do dia da semana correspondente (1 para domingo, 2 para segunda-feira, e assim por diante).
 */

package exercicios;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.println("1 - Domingo | 2 - Segunda | 3 - Terça | 4 - Quarta...");
        System.out.println("Digite um número válido para saber o dia da semana: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Esse número não corresponde a nhm dia");
        }
    }
}
