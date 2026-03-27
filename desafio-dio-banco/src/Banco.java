import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		
	
		
		System.out.println("--- Cadastro de Cliente ---");
		System.out.println("Digite seu Nome :");
		cliente.setNome(sc.next());
		System.out.println("Digite seu Idade: ");
		cliente.setIdade(sc.nextInt());
		System.out.println("Digite seu Cpf: ");
		cliente.setCpf(sc.next());
		System.out.println("Digite seu Telefone: ");
		cliente.setTelefone(sc.nextInt());
				
			
		
		System.out.println("Criando uma Nova Conta Bancaria: ");
		System.out.println("Digite 1 - Poupança || 2 -Corrente");		
		int tipoConta = sc.nextInt();	
		
		Conta conta;
		
		if (tipoConta == 1) {
			conta = new ContaPoupanca(cliente);
			System.out.println("Conta Poupança criada! " );
		}else {
			conta = new ContaCorrente(cliente); 
			System.out.println("Conta Corrente criada! " );
			}
		
		
		System.out.print("Digite o saldo para Depositar: ");
		conta.depositar(sc.nextDouble());
		
		System.out.println("Saldo atual : R$ " + conta.getSaldo());
		
	
		
	
	}	
	
}
	
	

