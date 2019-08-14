package oopConcept;

import java.util.Hashtable;

public class HasTable {

	public static void main(String[] args) {
		
		// Hastable is samiller to hasmap , but it is synchronised 
		//store the valu on the basis of key-valu pair
		//hastable we pacify an object which use an key ()
	/*Hashtable key use on form of object, each an every 
		object have one unick hascode, thats paticular hascode valu will be stroed */
		// null object can be use key and valu 
		
		//hastable 
		
		Hashtable t = new Hashtable();
		t.put(1, 20);
		t.put(2, 33);
		t.put(3, 10);
        System.out.println(t.get(1));
		System.out.println(t.size());
		//t.remove(2);
	//	System.out.println(t.size());
		
		// clone 
		Hashtable t1 = new Hashtable();
	t1  = (Hashtable)t.clone();
	System.out.println("the valu from t " + t);
	System.out.println("the valu from t1 " +t1);
		
		
		for(int i = 0;i<t.size();i++) {
			System.out.println(t.get(i));
		}
		
		Hashtable <Integer ,String> o = new Hashtable<Integer, String>();
		o.put(1, "tom");
		o.put(2, "hello");
		
		System.out.println(o.get(2));
	}

}
