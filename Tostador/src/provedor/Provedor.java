package provedor;

import java.util.List;
import java.util.Map;

//Programar hacia interfaces
public interface Provedor {
  void imprimirProvedor();
  
  List<ServiceTypes> getServices();
  void addServices(ServiceTypes serviceTypes);
  
  Map<String, Double> getCustomer();
  void addCustomer(String name, Double amount);
}
