package aulas;

import java.util.Scanner;

public class PlanoOperadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String plano;

        System.out.println("B = Basic | M = Midia | T = Turbo");
        System.out.println("Informe qual seu plano: ");
        plano = sc.nextLine();

        if (plano.equalsIgnoreCase("B")) {

            System.out.println("100 minutos de ligação");
        }
        else if (plano.equalsIgnoreCase("M")){

            System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
        }
        else if (plano.equalsIgnoreCase("T")) {

            System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5GB YouTube");
        }
        else {

            System.out.println("Plano desconhecido");
        }
    }
}
