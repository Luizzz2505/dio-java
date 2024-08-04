package aulas;

import java.util.Scanner;

public class PlanoOperadora1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String plano;

        System.out.println("B = Basic | M = Midia | T = Turbo");
        System.out.println("Informe seu palno: ");
        plano = sc.nextLine();

        /* não coloquei break propositalmente para n precisar repetir os
        minutos de ligação em todo caso novo*/

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
