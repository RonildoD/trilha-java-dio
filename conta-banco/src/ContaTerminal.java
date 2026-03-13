import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in).useLocale(Locale.US)) {
			int numero;
			String agencia;
			String nomeCliente;
			double saldo;
			
			System.out.println("Digite seu nome completo ");
			nomeCliente =sc.next();
			System.out.println("Por favor, digite o número da Agência !");
			agencia =sc.next();
			System.out.println("Por favor, digite o número da Conta !");
			numero =sc.nextInt();
			System.out.println("Por favor, digite a valor para Depositar !");
			saldo = sc.nextDouble();
			
			System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua "
					+ "agência é %s, conta %d e seu saldo %.2f já está disponível para saque !",nomeCliente , agencia, numero, saldo);
		}
		
		
		
		
	}

}
