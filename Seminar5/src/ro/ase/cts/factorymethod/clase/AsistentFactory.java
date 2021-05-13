package ro.ase.cts.factorymethod.clase;

public class AsistentFactory implements PersonalFactory {
	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);	
	}
}
