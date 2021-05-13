package ro.ase.cts.factorymethod.clase;

public class InfirmierFactory implements PersonalFactory{
	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Infirmier(nume);
	}

}
