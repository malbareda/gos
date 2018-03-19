package animal;

public class Test {

	public static void main(String[] args) {
		Gos perrito = new Gos();
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
		
		
		for(Animal a : gj ) {
			System.out.println("El ADN DE "+a.nom+" ES "+a.ADN);
		}
		
		
		
		
		perraco.mossega(pipo);
		
		
		
	}
	
	

}
