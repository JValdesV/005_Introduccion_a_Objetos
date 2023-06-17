package Principal;

public class Cuenta {
	
	//Atributos
	
	double saldo = 10; //Atributo con campo por defecto
	int agencia;
	int numero ;
	Cliente cliente;
	//Cliente cliente = new Cliente();
	
	//Metodos Anotación camelCase
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean transfiere(double valor, Cuenta destino) {
		
		if(this.saldo >= valor) {
			//this.saldo -= valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
		
	}
	
	public void mostrarSaldo() {
		System.out.println(this.saldo);
	}
	
	
	

}
