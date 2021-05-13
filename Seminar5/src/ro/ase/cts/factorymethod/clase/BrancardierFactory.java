package ro.ase.cts.factorymethod.clase;

public class BrancardierFactory implements PersonalFactory {
	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}

}
