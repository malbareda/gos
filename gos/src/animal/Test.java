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
		
		Gos pipo = new Gos("Pipo",10,3,"mezcla",100);
		
		pipo.mossega();
		
		Gos perraco = new Gos("John Cobra",10,100,"rotweiler",100);
		
		
		perraco.mossega(pipo);
		
		
		Ganso donald = new Ganso();
		
		donald.sonido();
		
		
		perraco.mossega(donald);
	}
	
	

}
