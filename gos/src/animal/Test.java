package animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Gos perrito = new Gos();
		
		Tortuga trachemys = new Tortuga();
		
		trachemys.sonido();
		
		System.out.println(perrito.getNom());
		
		perrito.sonido();
		perrito.sonido(5);
		
		
		perrito.mossega();
		
		perrito.sonido();
		perrito.mossega();
		
		perrito.sonido(1);
		perrito.mossega();
		
		Gos pipo = new Gos("Pipo",10,3,"mezcla",100,'m',true);
		
		pipo.mossega();
		
		Gos perraco = new Gos("John Cobra",10,100,"rotweiler",100,'m',false);
		
		Gos pipa = new Gos("Pipa",10,3,"mezcla",100,'f',true);
		
		Gos fill = (Gos) pipo.ligar(pipa);
		
		
		
		
		
		Ganso donald = new Ganso();
		
		donald.sonido();
		
		
		perraco.mossega(donald);
		
		
		Granja gj = Granja.get();
		
		gj.add(fill);
		
		
		Collections.sort(gj);
		
		for(Animal a : gj ) {
			System.out.println("El ADN DE "+a.nom+" ES "+a.ADN);
		}
		
		
		
		
		perraco.mossega(pipo);
		
		
		Mapache iceta = new Mapache();
		
		iceta.sonido();
		
		iceta.defecate();
		perraco.mossega(iceta);
		
		iceta.sonido();
		
		
		ArrayList<Animal> l = new ArrayList<Animal>();
		
		
		l.add(pipo);
		l.add(perraco);
		l.add(donald);
		l.add(iceta);
		l.add(pipa);
		l.add(fill);
		
		Collections.sort(l);
		
		
		System.out.println(l);
		
		Animal[] al = new Animal[3];
		al[0]=pipo;
		al[1]=donald;
		al[2]=iceta;
		
		//Arrays.sort(al);
		
		
		System.out.println("Es pipo mejor que iceta? La respuesta es : "+pipo.compareTo(iceta));
		
		
		
	}
	
	

}
