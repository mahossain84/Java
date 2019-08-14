package oopConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static <E> void main(String[] args) {
		ArrayList li  = new ArrayList();
		li.add(100);
		li.add(200);
		li.add("hello");
		li.add(12.33);
	
		
		System.out.println(li.size());
		System.out.println(li.get(2));
	for(int i = 0;i<li.size();i++){
		System.out.println(li.get(i));
	}
		ArrayList <Integer> ar = new ArrayList<Integer>();
	  ar.add(100);
	  ar.add(20);
	  
	  
	  ArrayList <String>  ap = new ArrayList<String>();
	  ap.add("100");
	  ap.add("tom");
	  
	  
	  ArrayList <E> ar1 = new ArrayList<E>();
	
	
     // Employ class object 
	Employe e1 = new Employe("alamgir" , 27, "Qa");
	Employe e2 = new Employe ("hasan", 31, "Op");
	Employe e3 = new Employe("alam" , 27, "tQa");

  //  creat arrayList 
     ArrayList<Employe> a1 = new ArrayList<Employe>();
     a1.add(e1);
     a1.add(e2);
     a1.add(e3);
     
     // using itrator to reverse valu 
  Iterator <Employe> it  =  a1.iterator();
   while (it.hasNext()) {
	 Employe r =  it.next();
	 System.out.println(r.name);
	 System.out.println(r.age);
	 System.out.println(r.dep);
	 
	   
   }


      }

}
