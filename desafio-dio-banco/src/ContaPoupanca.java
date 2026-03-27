
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void sacarComtaxa(double valor) {
		double taxa = valor * 0.05;
		super.sacar(valor, taxa);
	}
	
	
}
