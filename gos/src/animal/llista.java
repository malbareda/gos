package animal;

import java.util.ArrayList;

public class llista {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		ArrayList<String> lists = new ArrayList<String>();

		
		System.out.println(list);
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		list.add(1, 40);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		lists.add("hola");
		lists.add("que");
		lists.add("tal");
		
		System.out.println(lists);
		
		lists.remove("que");
		lists.clear();
		System.out.println(lists);
	}

}
