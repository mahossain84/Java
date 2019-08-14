package oopConcept;

import java.util.ArrayList;
import java.util.Iterator;





public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student("tom", 2, "235678");
		Student st2 = new Student("tokm", 12, "2358");
		Student st3 = new Student("Ayaat", 1, "23567896");

		
		ArrayList <Student>sp = new ArrayList<Student>();
		sp.add(st1);
		sp.add(st2);
		sp.add(st3);
		
		
		Iterator <Student> it = sp.iterator();
		while(it.hasNext()) {
			
		
		Student t = it.next();
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.id);
		
		
		}	
		
		ArrayList <String>a5 = new <String>ArrayList();
		a5.add("alamgir");
		a5.add("hello");
		a5.add("selenium");
		
		
		
		ArrayList <String>a6 = new <String>ArrayList();
		a6.add("hossain");
		a6.add("kamal");
		a6.add("java");
		
		
		
		
		a5.addAll(a6);
		
		for(int i =0;i<a5.size();i++) {
			System.out.println(a5.get(i));
		}
		
		a5.removeAll(a6);
		
		for(int i = 0;i<a5.size();i++) {
			System.out.println(a5.get(i));
			
		}
		
	
		
	}

}
