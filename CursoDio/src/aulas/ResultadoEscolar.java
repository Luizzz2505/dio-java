package aulas;

import java.util.Scanner;

public class ResultadoEscolar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, media, rec, mediaFinal;

        System.out.println("Informe sua n1: ");
        n1 = sc.nextDouble();

        System.out.println("Informe sua n2: ");
        n2 = sc.nextDouble();

        media = (n1+n2) / 2;

        if (media >= 7) {

            System.out.println("Aprovado");

        }
        else if (media >= 5 && media < 7) {

            System.out.println("Final");
            System.out.println("Insira sua nota da final: ");
            rec = sc.nextDouble();

            mediaFinal = (media + rec) / 2;

            if (mediaFinal >= 6) {

                System.out.println("Aprovado na final");
            }
            else {

                System.out.println("Reprovado na final");
            }
        }
        else {

            System.out.println("Reprovado");

        }
        System.out.println("Sua media: " + media);
    }
}
