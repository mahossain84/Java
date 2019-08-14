package oopConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList  <String >  ll = new LinkedList<String> ();
		ll.add("Apple");
		ll.add("Qp");
		ll.add("llp");
		ll.add("done");
		System.out.println("add all contains " +ll);
		
		ll.addFirst("alamgir ");
		ll.addLast("Ayaat");
		System.out.println("add all cntains " + ll);
		
		ll.remove(3);
		System.out.println("add al contains " + ll);
		
		System.out.println(ll.get(3));
		
		ll.set(0, "Tom");
		System.out.println("add al contains " + ll);
		
		System.out.println("****using for loop");
       
	  for(int i =0;i<ll.size();i++) {
		  System.out.println(ll.get(i));
	  }
		System.out.println("******* using advanced for loop");
		
		for(String st :ll) {
			System.out.println(st);
		}
		System.out.println("****** using itrator");
		
	Iterator <String>it = ll.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		System.out.println("******* using while loop");
	
        int n = 0;
        while(n<ll.size()) {
        	System.out.println(ll.get(n));
        	n++;
        	
        }
        
}
}
