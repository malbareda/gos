package gos;

import java.util.ArrayList;

public abstract class Animal {

	protected String nom;
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
