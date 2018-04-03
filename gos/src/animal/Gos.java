package animal;

import java.util.ArrayList;

public class Gos extends Animal implements Cloneable{
	
	private String raza;
	private int amistat;
	
	


	public String getRaza() {
		return raza;
	}

	public int getAmistat() {
		return amistat;
	}

	public Gos() {
		
		super();
		nom = "gofrillos";
		sexo = 'm';
		this.posibilidadDeCopularConElSexoOpuesto=true;
		raza = "mezcla";
		colores = new ArrayList<>();
		colores.add("invisible");
		amistat = -100;
		
		ADN = (int) ((Math.random()*900000000)+100000000);
		
		Granja gj = Granja.get();
		gj.add(this);
		
		
	}
	
public Gos(String nom, int edat, int lvl, String raza, int amistat, char sexo, boolean p) {
		super();
		this.nom = nom;
		this.edat = edat;		
		this.raza = raza;
		for(int i=0;i<lvl;i++) {
			lvlup();
		}
		this.sexo=sexo;
		this.posibilidadDeCopularConElSexoOpuesto=p;
		colores = new ArrayList<>();
		colores.add("invisible");
		this.amistat = amistat;
		ADN = (int) ((Math.random()*900000000)+100000000);
		
		Granja gj = Granja.get();
		gj.add(this);
		
		
	}
	
	
//	public void borda() {
//		System.out.println("guau guau");
//	}
//	
	public void sonido(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println(this+" dice guau guau");
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
		System.out.println(this+" dice guau guau");

	}

}
