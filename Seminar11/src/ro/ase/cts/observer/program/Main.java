package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		
		ManagerSala managerSala = new ManagerSala("sala 1"); 
		
		Client client = new Client("rbk");
		Client client2 = new Client("andra");
		Client client3 = new Client("nedelcu");
		
		managerSala.adaugareAbonat(client2);
		managerSala.adaugareAbonat(client);
		managerSala.adaugareAbonat(client3);
		
		managerSala.trimiteAnuntImportant("fotbal");
		managerSala.stergereAbonat(client2);
		managerSala.trimiteAnuntImportant("volei");
	}
}
