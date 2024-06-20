import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        static void ParametrosInvalidosException {
        
            Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro");
		    int parametroUm = terminal.nextInt();

		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = terminal.nextInt();

            try {

                static void contar ( int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            
                    int contagem = parametroDois - parametroUm;

                    for ( int conte = 0; conte == contagem; conte++ );
                    System.out.println("Resultado da subtração;" + conte);
                 

            } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }
            
    }    
    
}
