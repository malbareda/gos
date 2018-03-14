package animal;

import java.util.ArrayList;

public class Ganso extends Animal {

	private String raza;

	public Ganso() {

		nom = "Trump";
		edat = 0;
		lvl = 0;
		hp = 0;
		atk = 0;
		def = 0;
		spd = 0;
		raza = "aznar";
		colores = new ArrayList<>();
		colores.add("blanco");

	}

	public Ganso(String nom, int edat, String raza, int amistat) {

		this.nom = nom;
		this.edat = edat;
		this.lvl = 100;
		hp = 0;
		atk = 0;
		def = 0;
		spd = 0;
		this.raza = raza;
		// for(int i=0;i<lvl;i++) {
		// lvlup();
		// }

		colores = new ArrayList<>();
		colores.add("blanco");

	}

	public String getRaza() {
		return raza;
	}

	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("cuak cuak");
	}

//	public void graznar() {
//		System.out.println("cuak cuak");
//	}
	
//	@Override
//	public void sonido() {
//		System.out.println("cuak cuak");
//	}
	
	

}
