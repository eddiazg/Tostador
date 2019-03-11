package provedor;

import java.util.List;
import java.util.Map;

public class ProvedorIceImpl implements Provedor {
    //immutable object 
	private static final String PROVEDOR = "Soy el provedor ICE";

	@Override
	public void imprimirProvedor() {
		System.out.println(PROVEDOR);
	}

	@Override
	public List<ServiceTypes> getServices() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addServices(ServiceTypes serviceTypes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Double> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(String name, Double amount) {
		// TODO Auto-generated method stub
		
	}
}
