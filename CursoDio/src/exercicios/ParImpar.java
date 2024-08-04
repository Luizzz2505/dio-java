package exercicios;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] ags) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Insira um número: ");
        numero = sc.nextInt();

        String resultado = numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(resultado);

    }
}
