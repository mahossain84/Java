package objectOrinted;

public class LocalGlobalVariable {
	// globale variable - will be avavilable across all the function with same condition .
	/* if u want to acces non statick global variable u have
	 *  to creat an object
	 */
	String name = "tom";
	int age = 25;
	
	public static void main(String[] args) {
		LocalGlobalVariable obj = new LocalGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
		int i = 10; // local variable
		System.out.println(i);
	}

	public void sum() {
		int i =30; // local variable for sum method 
		int j = 40;
		int age = 15;
	}
	
	
}
