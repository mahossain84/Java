package objectOrinted;

public class MethodOverloding {

	public static void main(String[] args) {
		MethodOverloding m = new MethodOverloding();
		m.sum();
		m.sum(10);
		m.sum(10, 56);
		
		

	}
	// q. can wenoverload main method ?
	// ans - yes we can be overload .b
	// what is method overloding?
	//ans - when the method name is same with different arguments or input parameter with-
	//in the same class.
	
	/* you can not creat duplacate method name ,method is independent from each other
	 * you can not creat method inside the method 
	 */
    public void sum() { //
    	System.out.println("sum method o parameter");
    	
    }
    
    public void sum(int i) {
    	System.out.println("sum mehtod 1 parameter");
    	System.out.println(i);
    	
    }
    public void sum(int k,int p) {
    	System.out.println("sum method 2 parameter ");
    	System.out.println(k + p);
    	
    }
}
