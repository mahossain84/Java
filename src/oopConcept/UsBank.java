package oopConcept;

public interface UsBank {
	// interface only method declaration 
	// no method body ...only prototype 
	// in interface we can declar variable ,variable are by defult static nature
	// variable value will not be changed 
	//no static method in interface ,we can not write any static method in interface 
	// no main method in interface 
	//we can not creat the objecet nature 
	//
	
	/* question - what is dynamic polymorphison ?
	 * child class object can be referred by parent interface refarance value
	 * 
	 * 
	 */
	public void credit();
	
	public void debit();
	
	public void transferMoney();

}
