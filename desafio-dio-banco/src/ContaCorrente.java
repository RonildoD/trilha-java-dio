
public class ContaCorrente extends Conta{
	
	public ContaCorrente (Cliente cliente) {
		super(cliente);
	}
		
	public void sacarSimples(double valor ) {
		super.sacar(valor, 0);
	}
		
	
}
