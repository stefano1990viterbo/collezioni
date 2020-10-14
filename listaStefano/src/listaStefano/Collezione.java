package listaStefano;


import java.util.ArrayList;

public class Collezione {

	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();

	public void aggiungiCliente(Cliente c) {
		cliente.add(c);

	}

	public void serviPrimoCliente() {

		if (cliente.size() > 0) {

			for (int i = 0; i < cliente.size(); i++) {

				if (!cliente.equals(null)) {
					System.out.println(cliente.get(i) + " questo è il primo cliente in coda");
//				spostaCliente(i);
					rimuoviClienteServito(i);

					break;
				}

				else
					System.out.println("è successo del bordello");
			}
		} else if (cliente.size() == 0) {
			System.out.println("non c'è nessun cliente");

		} else
			System.out.println("è successo del bordello");

	}

	public void spostaCliente(int i) {
		int ultimoPosto = cliente.size() - 1;
		cliente.set(ultimoPosto, cliente.get(i));
	}

	public void rimuoviClienteServito(int i) {
		cliente.remove(i);

	}

	public void stampaListaClienti() {
		for (int i = 0; i < cliente.size(); i++) {

			System.out.println(cliente.get(i) + " " + i);

		}
	}

}
