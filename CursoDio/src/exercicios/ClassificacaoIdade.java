/*
Escreva um programa que classifique uma pessoa de acordo com sua idade. As classificações são:

 Menor de 13 anos: Criança
        Entre 13 e 18 anos: Adolescente
        Entre 19 e 59 anos: Adulto
        60 anos ou mais: Idoso
 */
package exercicios;

import java.util.Scanner;

public class ClassificacaoIdade {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade:");
        idade = sc.nextInt();

        if (idade < 13) {

            System.out.println("Criança");
        }
        else if (idade >= 13 && idade <= 18) {

            System.out.println("Adolescente");
        }
        else if (idade >= 19 && idade <=59) {

            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }

    }
}
