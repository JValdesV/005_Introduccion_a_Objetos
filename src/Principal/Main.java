package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos 2 objetos Cuenta
		Cuenta miCuenta = new Cuenta();
		//Este 2do objeto es referencia del primero
		Cuenta miCuenta2 = miCuenta;
		
		//miCuenta.saldo = 50000;
		//miCuenta.titular = "Javier";
		//miCuenta.numero = 12444555;
		miCuenta.agencia = 8;
		
		//System.out.println(miCuenta.titular);
		System.out.println(miCuenta.saldo);
		System.out.println(miCuenta.numero);
		System.out.println(miCuenta.agencia);
		
		//Se analiza si los 2 objetos son los mismos o si la referencia apunta al mismo objeto
		if(miCuenta == miCuenta2) {
			System.out.println("Ambos objetos son lo mismo");
		}
		
		System.out.println(miCuenta);
		System.out.println(miCuenta2);
		
		
		//Seteamos el saldo del objeto Cuenta2
		miCuenta2.saldo += 10000;
		
		//Vemos si la refencia afecta al objeto en su campo saldo
		System.out.println(miCuenta2.saldo);
		System.out.println(miCuenta.saldo);
		
		System.out.println("***************");
		
		Cuenta c1 = new Cuenta();
		c1.saldo = 50000;
		c1.deposita(10000);
		c1.mostrarSaldo();
		
		Cuenta c2 = new Cuenta();
		c2.saldo = 80000;
		c2.deposita(10000);
		c2.mostrarSaldo();
		
		Cliente cliente1 = new Cliente();
		cliente1.nombre = "Javier";
		cliente1.telefono = 980090011;
		cliente1.documento = 123456789;
		
		cliente1.mostrarCliente();
		
		c1.cliente = cliente1;
		
		System.out.println(c1.cliente.nombre);
		
		

	}

}
