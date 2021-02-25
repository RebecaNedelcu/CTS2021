package program;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		Girafa g=new Girafa("Girafa1");
		Girafa g2=new Girafa("girafa2");
		z.addAnimal(g);
		z.addAnimal(g2);
		z.feedAllAnimals();
		Zebra zebra1 = new Zebra("Zebra1");
		Zebra zebra2 = new Zebra("Zebra2");
		z.addAnimal(zebra1);
		z.addAnimal(zebra2);
		z.feedAllAnimals();
	}

}


