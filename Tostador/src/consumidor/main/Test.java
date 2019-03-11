package consumidor.main;

//import consumidor.Tostador;
import consumidor.CustomersAndServices;
import provedor.Provedor;
//import provedor.ProvedorIceImpl;
import provedor.ProvedorMovistarImpl;
import static provedor.ServiceTypes.ELECTRICIDAD;
import static provedor.ServiceTypes.TELEFONIA;
//import static provedor.ServiceTypes.OTROS;

public class Test {

	public static void main(String[] args) {
		// esto es una variable de instancia.
		/*
		 * Tostador tostador = new Tostador(new ProvedorIceImpl());
		 * tostador.imprimirProvedor(); tostador = new Tostador(new
		 * ProvedorMovistarImpl()); tostador.imprimirProvedor();
		 */

		/*ProvedorIceImpl ice = new ProvedorIceImpl();
		ice.addCustomer("Jorge", 100d);
		ice.addCustomer("Xinia", 200d);
		ice.addServices(ELECTRICIDAD);
		ice.addServices(TELEFONIA);*/
		
		ProvedorMovistarImpl movistar = new ProvedorMovistarImpl();
		movistar.addCustomer("Jorge", 100d);
		movistar.addCustomer("Xinia", 200d);
		movistar.addServices(ELECTRICIDAD);
		movistar.addServices(TELEFONIA);
		imprimirServicios(movistar);

	}
	
	private static void imprimirServicios(Provedor provedor) {
		CustomersAndServices cs = new CustomersAndServices(provedor);
		cs.imprimirClientes();
		cs.imprimirServices();
	}
}
