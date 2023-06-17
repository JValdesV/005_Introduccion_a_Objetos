package Principal;

public class Cliente {

	int documento;
	int telefono;
	String nombre;
	
	
	//Metodos
	
	public void mostrarCliente() {
		System.out.println(this.documento + " " + this.nombre + " "+ this.telefono);
	}
	
}
