package animal;

import java.util.ArrayList;

public abstract class Animal implements Comparable<Animal>{

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
	protected int ADN;
	int estado;  //0 vivo 1 muerto 
	
	
	public Animal(){
		this.nom = "Null";
		sexo = 'm';
		edat = 0;
		lvl = 0;
		hp = 10;
		atk = 1;
		def = 1;
		spd = 1;
		ADN = 100000002;
		ArrayList<Animal> gj = Granja.get();
		gj.add(this);
		estado = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (estado==1) {
			this.nom = nom;
		}
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

	public Animal ligar(Animal a) throws NecromancyException, NecrophiliaException {
		if(estado==1) {
			throw new NecromancyException();
		}
		if(a.estado==1) {
			throw new NecrophiliaException();
		}
		
		if (a.getClass().equals(this.getClass())) {
			if (a.posibilidadDeCopularConElSexoOpuesto == true && this.posibilidadDeCopularConElSexoOpuesto == true) {
				if (a.sexo != this.sexo) {
					System.out.println("Vaya, mientras cuidabamos a " + this.getNom() + " y " + a.getNom()
							+ " ha aparecido un huevo de la1 nada!");
					try {
						Animal fill = (Animal) this.clone();

						fill.edat = 0;
						int sx = (int) (Math.random() * 2);
						if (sx == 0)
							fill.sexo = 'f';
						else
							fill.sexo = 'm';
						if (fill.sexo == this.sexo)
							fill.nom = this.getNom() + " Jr.";
						else
							fill.nom = a.getNom() + " Jr.";
						fill.lvl = 1;
						int sx2 = (int) (Math.random() * 10);
						if (sx2 == 9)
							fill.posibilidadDeCopularConElSexoOpuesto = false;
						else
							fill.posibilidadDeCopularConElSexoOpuesto = true;

						/// Extraccion de Digitos

						String s1, s2;
						s1 = this.ADN + "";
						s2 = a.ADN + "";
						String sfill = "";
						for (int i = 0; i < s1.length(); i++) {
							int rand = (int) (Math.random() * 2);
							if (rand == 0) {
								sfill = sfill + s1.charAt(i);
							} else {
								sfill = sfill + s2.charAt(i);
							}

						}
						fill.ADN = Integer.parseInt(sfill);

						int adnp = this.ADN;
						int adnm = a.ADN;
						int adnfill = 0;
						for (int i = 0; i < s1.length(); i++) {
							int rand = (int) (Math.random() * 2);
							if (rand == 0) {
								adnfill += adnp % 10;
								adnp /= 10;
								adnm /= 10;
								adnfill *= 10;

								/// 12345
							} else {
								adnfill += adnm % 10;
								adnp /= 10;
								adnm /= 10;
								adnfill *= 10;
							}
						}

						return fill;
					} catch (CloneNotSupportedException e) {
						e.printStackTrace();
					}

				}
			}
		}
		return null;

	}

	public Caca defecate() {
		
		if(this.getClass().equals(Ganso.class)) {
			return new Caca(20,"beige",false);
		}else if (this.getClass().equals(Gos.class)) {
				Gos g = (Gos) this;
				String raza = g.getRaza();
				switch (raza) {
				case "rotweiler":
					return new Caca(500, "negro", false);
				case "chihuahua":
					return new Caca(5, "marron", true);
				case "mezcla":
					return new Caca(100, "marron", false);
				}
			
		
		}else if(this instanceof Mapache) {
			return new Caca(50,"rosa",true);
		}
		return new Caca(100,"marron",false);

	}
	
	
	public void atacar(Animal animal) throws NecromancyException {
		//if(amistat > 0) {
			System.out.println(nom+" ha mossegat "+atk+" vegades a "+animal.nom);
			int dany = this.atk-animal.def;
			if(dany>0)animal.hp-=dany;
			System.out.println(animal.nom+" ha rebut "+dany+" dany. ");
			if(animal.hp<=0) animal.die();
		//}else {
			//System.out.println(nom+" t'ha mossegat "+atk+" vegades");
		//}
		
	}
	

	protected void die() throws NecromancyException {
		
		if (estado!=1) {
			// TODO Auto-generated method stub
			System.out.println(nom + " muere.");
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			estado =1;
		}else {
			throw new NecromancyException();
		}
		
		
	}

	
	public int compareTo(Animal a) {
		//compareTo, devuelve negativo si la compracion 
		//da this<a, 0 si this==a, y positivo si this>a
		return -(this.atk - a.atk);
		//el negativo delante es porque en vez de mas pequeño
		//a mas grande, queremos ordenar de grande a pequeño
		
	}	
	
	
	public String toString() {
		return this.nom;

	}
}
