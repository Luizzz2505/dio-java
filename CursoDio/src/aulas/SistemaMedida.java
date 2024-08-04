package aulas;

import java.util.Scanner;

public class SistemaMedida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sigla;

        System.out.println("P = pequeno | M = médio | G = grande");
        System.out.println("Informe o tamanho: ");
        sigla = sc.nextLine();

        // equalsIgnoreCase é um método para comparar Strings
        if (sigla.equalsIgnoreCase("P")){

            System.out.println("Pequeno");
        }
        else if (sigla.equalsIgnoreCase("M")) {

            System.out.println("Médio");

        }
        else if (sigla.equalsIgnoreCase("G")) {

            System.out.println("Grande");
        }
        else {

            System.out.println("Tamanho desconhecido");
        }


    }
}
