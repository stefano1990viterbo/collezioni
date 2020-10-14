package listaStefano;

import java.util.ArrayList;

public class Collezione {

	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private boolean clientePresente;

	public void aggiungiCliente(Cliente c) {
		cliente.add(c);
	}

	public void serviPrimoCliente() {
		controlloCliente();
		if (controlloCliente().equals(true)) 
			chiamaCliente(); 		
	}

	public void spostaCliente(int i) {
		int ultimoPosto = cliente.size() - 1;
		cliente.set(ultimoPosto, cliente.get(i));
	}

	public void rimuoviClienteServito(int i) {
		cliente.remove(i);

	}

	public void stampaListaClienti() {
		for (int i = 0; i < cliente.size(); i++) 
			System.out.println(cliente.get(i) + " " + i);
	}

	public Boolean controlloCliente() {
		if (cliente.size() > 0) {
			clientePresente = true;
		} else if (cliente.size() == 0) {
			clientePresente = false;
			System.out.println("non c'è nessun cliente");
		}
		return clientePresente;
	}

	public void chiamaCliente() {
		for (int i = 0; i < cliente.size(); i++) {
			if (!cliente.equals(null)) {
				System.out.println(cliente.get(i) + " questo è il primo cliente in coda");
				rimuoviClienteServito(i);
				break;
			}
		}
	}

}
