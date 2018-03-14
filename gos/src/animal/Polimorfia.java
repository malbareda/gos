package animal;

import java.util.ArrayList;

public class Polimorfia {
	
	//ForgottenMains
	public static void main(String[] args) {
		ArrayList<Animal> granja = new ArrayList<Animal>();
		
		Gos perraco = new Gos("John Cobra",10,100,"rotweiler",100);
		Gos pipo = new Gos("Pipo",10,3,"mezcla",100);
		Ganso donald = new Ganso();
		
		granja.add(perraco);
		granja.add(pipo);
		granja.add(donald);
		
		System.out.println(donald.getClass());

	}

}
