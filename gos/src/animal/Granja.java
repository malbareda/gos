package animal;

import java.util.ArrayList;

public class Granja extends ArrayList<Animal>{
	
	static Granja granja=null;
	
	private Granja(){
		
	}
	
	static Granja get() {
		
		if(granja==null) {
			granja= new Granja();
			return granja;
		}
		return granja;
		
	}
	
	

}
