import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira sua data de nascimento");
    String dataNascimento = scanner.next();

    System.out.println("Insira o número da sua conta");
    int numero = scanner.nextInt();

    System.out.println("Insira sua agencia");
    String agencia = scanner.next();

    System.out.println("Digite o seu nome completo");
    String nomeCliente = scanner.next();

    System.out.println("Digite o seu email");
    String email = scanner.next();

    System.out.println("Digite agora uma senha para a sua conta");
    String senha = scanner.next();


/*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, 
sua agência é [Agencia], 
conta [Numero] e seu saldo [Saldo] já está disponível para saque".
 * 
 */

    System.out.println("Olá " + nomeCliente);
    System.out.println("obrigado por criar uma conta em nosso banco");
    System.out.println("sua agencia é " + agencia);
    System.out.println("O número da sua conta é " + numero) ;
    System.out.println("O seu saldo é de " + 0);

    }
}
