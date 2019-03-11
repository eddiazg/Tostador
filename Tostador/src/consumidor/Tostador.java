package consumidor;

import provedor.Provedor;

public class Tostador {
	//immutable object
	private final Provedor provedor;
	
	//injeccion de dependencia
	public Tostador(Provedor provedor) {
	  this.provedor = provedor; //estamos haciendo composicion. 	
	}
	
	public void imprimirProvedor() {
	  provedor.imprimirProvedor();	
	}

}
