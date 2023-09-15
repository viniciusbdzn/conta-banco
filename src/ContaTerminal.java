import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.close();
        
        String nomeCliente = "Vinicius Badazoni";
        String saldo = "5.320,35";
        
        System.out.println("Olá, Sr(a) " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " ,conta: " + numeroConta + ".\n Seu saldo disponível é: R$" + saldo);
    }
}
