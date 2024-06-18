import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Conta");
        int numero = Scanner.nextInt();

        System.out.println("Digite o numero da Agência");
        String agencia = Scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = Scanner.next();
        
        System.out.println("Digite seu saldo");
        double saldo = Scanner.nextDouble();


        System.out.println("Olá" + nomeCliente);
        System.out.println("Obrigado por criar uma conta em nosso banco,");
        System.out.println("Agência é:" + agencia);
        System.out.println("Conta:" + numero);
        System.out.println("Saldo" + saldo);
        System.out.println("já disponivel para saque.");


        

        
    }
}
