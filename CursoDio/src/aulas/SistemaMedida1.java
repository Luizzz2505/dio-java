package aulas;

import java.util.Scanner;

public class SistemaMedida1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sigla;

        System.out.println("P = pequeno | M = médio | G = grande");
        System.out.println("Informe o tamanho: ");
        sigla = sc.nextLine();

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
