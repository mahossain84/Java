package oopConcept;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashMapConcept {

	public static void main(String[] args) {
		// Hashmap is a class ,which impliments map interface 
		// extends Abstractmap 
		//it contains only uniquick values 
		//store the values - key and values pair 
		//it may have only null key and multiple values 
		//it mantains no order 
		// hash map non-scyncronized ----meanse not threat safe 
		// whats is meanse concered modification exception ?
		//  it meanse - fail - Fast - condition 
		
		HashMap <Integer,String > mp = new HashMap<Integer, String>();
		mp.put(1, "java");
		mp.put(2, "Selinium");
		mp.put(3, "Ayaat");
		
		System.out.println(mp.get(2));
		
	  // how to itrated hash map - using for loop with entry set 
		for(Entry m :mp .entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		System.out.println(mp);
		mp.remove(2);
		System.out.println(mp);

		
		
		HashMap <Integer,Employe> mo  = new HashMap<Integer, Employe>();
		Employe em1 = new Employe("Ayaat", 1, "newborn");
		Employe em2 = new Employe("Afran", 2, "oneYear");
		Employe em3 = new Employe("Baby", 3, "Justborn");
		
		mo.put(1, em1);
		mo.put(2, em2);
		mo.put(3, em3);
		
		// itrte or traverse 
		
		System.out.println("****** After the itrator ");
		for(Entry <Integer, Employe> o :mo.entrySet()) {
	      int key = o.getKey();
	      Employe e = o.getValue();
	      System.out.println("Employ " + "key " + "info : ");
	      System.out.println(e.name +" "+ e.age + " " + e.dep);
		}
		
		
		
		
		
	}

}
