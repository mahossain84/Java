package objectOrinted;

public class Car {
	
	
	int  model;
	int wheel;
	
   public static void main(String[] args) {
	   
	   // how to creat an object?
	 //  new keyword is used for creat an object 
	   //ob,ob2,ob3 is object refarance variable
	
	   Car ob = new Car();
	   Car ob2 = new Car();
	   Car ob3 = new Car();   
	   
	   
	  ob.model = 215;
	  ob.wheel = 4;
	  System.out.println(ob.model);
	  System.out.println(ob.wheel);
	  
	  ob2.model = 432;
	  ob2.wheel = 2;
	  
	  ob3.model = 2015;
	  ob3.wheel = 8;
	  System.out.println(ob2.model);
	  System.out.println(ob2.wheel);
	  System.out.println(ob3.model);
	  System.out.println(ob3.wheel);
	  
	  System.out.println(" after shifting the refarance");
	  
	  
	  ob = ob2;
	  ob2 = ob3;
	  ob3 = ob;
	  ob.model = 10;
	  System.out.println(ob.model);
	  ob3.model =20;
	  System.out.println(ob.model);
	  System.out.println(ob3.model);
			  
	  
}
}
