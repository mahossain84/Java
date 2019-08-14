package oopConcept;

public class Bmw extends Car{
	
	/* when same method is present  in parent class as well as in child class with same name 
	 * and same number of aggrument is call method overridding .
	 * when method name is same with different arguments or input parameters within the same class -
	 * is call method over lodaing .
	 * 
	 */
	public void Start() {
		System.out.println("bmw ......Start");
		
	}
	public void  stop() {
		System.out.println("bmw......stop ");
		
	}
	
	public void  saftey() {
		System.out.println("bmw......saftey ");
	}
}
