package ro.ase.cts.command.clase;

public class ComandaConstituireCont extends Comanda {
	public ComandaConstituireCont(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());
	}
}
