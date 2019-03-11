package consumidor;

import provedor.Provedor;
import provedor.ServiceTypes;

public class CustomersAndServices {
	// immutable object
	private final Provedor provedor;

	// injeccion de dependencia
	public CustomersAndServices(Provedor provedor) {
		this.provedor = provedor; // estamos haciendo composicion.
	}

	public void imprimirProvedor() {
		provedor.imprimirProvedor();
		
	}

	
	
	
	public void imprimirClientes() {
		for (String name : provedor.getCustomer().keySet()) {
			System.out.print("cliente: " + name + ", ");
			System.out.println("monto adeudado:" + provedor.getCustomer().get(name));
		}
	}

	public void imprimirServices() {
		for (ServiceTypes type : provedor.getServices()) {
			System.out.print("servicio: " + type.getName() + ", ");
			System.out.println("monto total: " + type.getName());
		}

	}
}
