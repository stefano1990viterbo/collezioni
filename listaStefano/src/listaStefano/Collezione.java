package listaStefano;

import java.util.ArrayList;

public class Collezione {

	private ArrayList<Cliente> codaClienti = new ArrayList<Cliente>();

	public void aggiungiCliente(Cliente c) {
		codaClienti.add(c);
	}

	public void serviPrimoCliente() {
		sonoPresentiClientiNellaCoda();
		if (sonoPresentiClientiNellaCoda().equals(true)) {
			chiamaCliente(); 		}
	}

//	public void spostaCliente(int i) {
//		int ultimoPosto = codaClienti.size() - 1;
//		for(int k=0;k<codaClienti.size();k++) {
//		
//		
//			
//			
//		}
//		codaClienti.set(ultimoPosto, codaClienti.get(i));
//	}

	public void rimuoviClienteServito(int i) {
		codaClienti.remove(i);
	}

	public void stampaListaClienti() {
		for (int i = 0; i < codaClienti.size(); i++) {
			System.out.println(codaClienti.get(i) + " " + i);}
	}

	public Boolean sonoPresentiClientiNellaCoda() {
		if (codaClienti.isEmpty()) {
			System.out.println("non c'è nessun cliente");
			return false;
		} 
			return true;
	}
	
	public void chiamaCliente() {
		int clienteDaRimuovere=0;
		for (int i = 0; i < codaClienti.size(); i++) {
			if (codaClienti!=null) {
				System.out.println(codaClienti.get(i) + " questo è il primo cliente in coda");				
				clienteDaRimuovere=i;			
				break;
			}
		}
		if(!codaClienti.isEmpty()) {
			rimuoviClienteServito(clienteDaRimuovere);
		}
	}

}
