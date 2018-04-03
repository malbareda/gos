package animal;

import java.util.ArrayList;

public class Ganso extends Animal {

	private String raza;

	public Ganso() {
		super();
		nom = "Trump";
		raza = "aznar";
		colores = new ArrayList<>();
		colores.add("blanco");
		ADN = (int) ((Math.random()*900000000)+100000000);
		Granja gj = Granja.get();
		gj.add(this);
		

	}

	public Ganso(String nom, int edat, String raza, int amistat) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.lvl = 100;
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
		System.out.println(this+" dice: cuak cuak");
	}
	

//	public void graznar() {
//		System.out.println("cuak cuak");
//	}
	
//	@Override
//	public void sonido() {
//		System.out.println("cuak cuak");
//	}

	

}
