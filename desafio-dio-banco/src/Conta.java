
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 001 ;
	private static int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
	}
	
	
	
	@Override
	public void sacar(double valor, double taxa) {
		double valorTotal = valor + taxa;
		
		if (this.saldo >= valorTotal) {
			this.saldo -= valorTotal;
		}else {
			System.out.println("Saldo insuficiente! ");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contradestino) {
		this.sacar(valor, 0);
		contradestino.depositar(valor);
	}
		
		
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
