package animal;

public class Cobra extends Animal{
	
	boolean veneno;
	String raza;

	@Override
	public void sonido() {
		System.out.println("ssssss sssssssssuspes");
	}
	
	public Cobra(){
		super();
		veneno = true;
		raza = "Cobra Real";
		nom = "Cobra Null";
		
	}
	
	
	
	
	

}
