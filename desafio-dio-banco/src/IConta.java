
public interface IConta {
	
	void sacar(double valor, double taxa) ;
		
	void depositar(double valor);
	
	void transferir(double valor, Conta contradestino);
		
	
}
