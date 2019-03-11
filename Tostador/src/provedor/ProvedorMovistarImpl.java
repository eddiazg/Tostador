package provedor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvedorMovistarImpl  implements Provedor {
    //immutable object 
	private static final String PROVEDOR = "Soy el provedor Movistar";
    private static final List<ServiceTypes> serviceList = new ArrayList<ServiceTypes>();
    private static final Map<String, Double> customers = new HashMap<String, Double>();
	
	@Override
	public void imprimirProvedor() {
		System.out.println(PROVEDOR);
	}

	@Override
	public List<ServiceTypes> getServices() {
		return serviceList;
	}
	
	@Override
	public void addServices(ServiceTypes serviceTypes) {
		serviceList.add(serviceTypes);
	}

	@Override
	public Map<String, Double> getCustomer() {
		return customers;
	}

	@Override
	public void addCustomer(String name, Double amount) {
		customers.put(name, amount);
	}
	
	
}
