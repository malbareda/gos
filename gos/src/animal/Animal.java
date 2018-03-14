package animal;

import java.util.ArrayList;

public abstract class Animal {

	protected String nom;
	char sexo;
	boolean posibilidadDeCopularConElSexoOpuesto;
	protected int edat;
	protected int lvl;
	protected ArrayList<String> colores;
	protected int hp;
	protected int atk;
	protected int def;
	protected int spd;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public int getLvl() {
		return lvl;
	}

	public ArrayList<String> getColores() {
		return colores;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpd() {
		return spd;
	}
	
	
	
	public abstract void sonido();
	
	public Animal ligar(Animal a) {

		if(a.getClass().equals(this.getClass())) {
			if(a.posibilidadDeCopularConElSexoOpuesto==true&&this.posibilidadDeCopularConElSexoOpuesto==true) {
				if(a.sexo!=this.sexo) {
					System.out.println("Vaya, mientras cuidabamos a "+this.getNom()+" y "+a.getNom()+" ha aparecido un huevo de la nada!");
					try {
						Animal fill = (Animal) this.clone();
						
						fill.edat=0;
						int sx = (int)(Math.random()*2);
						if (sx==0) fill.sexo='f';
						else fill.sexo='m';
						if(fill.sexo==this.sexo) fill.nom=this.getNom()+" Jr.";
						else fill.nom=a.getNom()+" Jr.";
						fill.lvl=1;
						int sx2 = (int)(Math.random()*2);
						if (sx2==0) fill.posibilidadDeCopularConElSexoOpuesto=true;
						else fill.posibilidadDeCopularConElSexoOpuesto=false;
						
						
						return fill;
					} catch (CloneNotSupportedException e) {
						
						e.printStackTrace();
					}
					
				}
			}
		}
		return null;
		
	}
	
	
	
	protected void die() {
		// TODO Auto-generated method stub
		System.out.println(nom+" muere.");
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
