package objectOrinted;

public class StaticNonStatick {
	
	String name = "tom"; // non ststic global variable 
	static int age = 25; // static  global method 
    
	
	// Q. how to call static method & variable 
	// ans - there are two ways 1. call directly 2.calling by class name 
    // Q. how to call non static class & variable
	// ans - u have to creat an object
	
	// Q. can i we acess static method by object 
	//ans - yes we can , but it is not a good pratice & java give us warning .
	public static void main(String[] args) {
		sum();
		StaticNonStatick.sum();
		System.out.println(age);
		System.out.println(StaticNonStatick.age);
		StaticNonStatick ob = new StaticNonStatick();
		ob.send();
		System.out.println(ob.name);
		
	}
   public void send() { // non static method 
	   System.out.println("send mail");
	   
	   
   }
   public static void sum() { //static method 
	   System.out.println("add money");
   }
}
