//importando as classes que serão usadas
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner para o input
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        //fechando o scanner
        scanner.close();
        
        //usando o main args com os valores definidos no arquivo de configuração launch.json
        String nomeCliente = args[0];
        String saldo = args[1];
        
        //mensagem que será exibida para o usuário
        System.out.println("Olá, Sr(a) " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " ,conta: " + numeroConta + ".\n Seu saldo disponível é: R$" + saldo);
    }
}
