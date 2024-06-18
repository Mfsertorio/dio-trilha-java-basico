import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o numero da Conta");
        int numero = scanner.nextInt();

        System.out.print("Digite o numero da Agência");
        String agencia = scanner.nextString();

        System.out.print("Digite o nome do cliente");
        String nomeCliente = scanner.nextString();
        
        System.out.print("Digite seu saldo")
        double saldo = scanner.nextDouble();

        System.out.print("Olá" + nomeCliente, "obrigado por criar uma conta em nosso banco, sua agência é:" + agencia, "conta:" + numero, "e eu saldo" + saldo, "já disponivel para saque.");

        

        
    }
}
