package gos;

import java.util.ArrayList;

public class Gos extends Animal{
	
	private String raza;
	private int amistat;
	
	


	public String getRaza() {
		return raza;
	}

	public int getAmistat() {
		return amistat;
	}

	public Gos() {
		
		nom = "Eh tu vete, no, fuera, no, no, perrito bueno";
		edat = 0;
		lvl = 0;
		hp = 0;
		atk = 0;
		def = 0;
		spd = 0;
		raza = "mezcla";
		colores = new ArrayList<>();
		colores.add("invisible");
		amistat = -100;
		
		
	}
	
public Gos(String nom, int edat, int lvl, String raza, int amistat) {
		
		this.nom = nom;
		this.edat = edat;
		this.lvl = 0;
		hp = 0;
		atk = 0;
		def = 0;
		spd = 0;
		this.raza = raza;
		for(int i=0;i<lvl;i++) {
			lvlup();
		}
		
		colores = new ArrayList<>();
		colores.add("invisible");
		this.amistat = amistat;
		
		
	}
	
	
//	public void borda() {
//		System.out.println("guau guau");
//	}
//	
	public void sonido(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println("guau guau");
			atk--;
		}
	}
	
	
	public void mossega() {
		if(amistat > 0) {
			System.out.println(nom+" ha mossegat "+atk+" vegades a un altre gos");
		}else {
			System.out.println(nom+" t'ha mossegat "+atk+" vegades");
		}
		
	}
	
	
	public void mossega(Animal animal) {
		if(amistat > 0) {
			System.out.println(nom+" ha mossegat "+atk+" vegades a "+animal.nom);
			int dany = this.atk-animal.def;
			if(dany>0)animal.hp-=dany;
			System.out.println(animal.nom+" ha rebut "+dany+" dany. ");
			if(animal.hp<=0) animal.die();
		}else {
			System.out.println(nom+" t'ha mossegat "+atk+" vegades");
		}
		
	}
	
	
	

	private static void disappear(Gos gos) {
		gos = null;
		
	}

	public void lvlup() {
		lvl++;
		switch(raza) {
		case "rotweiler":
			atk+=5;
			def+=4;
			spd+=1;
			hp+=3;
			break;
		case "chihuaua":
			atk+=2;
			def+=1;
			spd+=20;
			hp+=1;
			break;
		case "mezcla":
			atk+=3;
			def+=3;
			spd+=3;
			hp+=3;
			break;
		}
	}

	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("guau guau");
	}

}
