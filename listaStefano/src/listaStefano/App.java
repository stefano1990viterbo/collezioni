package listaStefano;

public class App {

	public static void main(String[] args) {
	
		Collezione c=new Collezione();
		Cliente cliente =new Cliente("stefano", "ricci");
		Cliente cliente2 =new Cliente("cristian", "luzzetti");
		Cliente cliente3=new Cliente("mario", "gerardo");
		Cliente cliente4 =new Cliente("pipolo", "pippo");
		Cliente cliente5 =new Cliente("mariuccio", "marinetti");
		
		c.aggiungiCliente(cliente);
		c.aggiungiCliente(cliente2);
		c.aggiungiCliente(cliente3);
		c.aggiungiCliente(cliente4);
		c.aggiungiCliente(cliente5);
		

		c.stampaListaClienti();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		
		c.aggiungiCliente(cliente);
		c.aggiungiCliente(cliente2);
		c.aggiungiCliente(cliente3);
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		c.serviPrimoCliente();
		
		c.chiamaCliente();
	}

}
