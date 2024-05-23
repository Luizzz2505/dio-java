import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobreNome = scanner.next();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(nomeCompleto(primeiroNome, sobreNome));
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Seu saldo: " + saldo + " já está disponível para saque.");
    }

        public static String nomeCompleto(String primeiroNome, String sobreNome){
            return "Olá, " + primeiroNome.concat(" ").concat(sobreNome) + "! Obrigado por criar uma conta em nosso banco.";
        }
}
