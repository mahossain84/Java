package oopConcept;

public class TestBank {

	public static void main(String[] args) {
		
		// if a class is implementing any interface,then it is mandotory to define over-
		//rride all the methods of interface.
		HsbcBank obj = new HsbcBank();
		obj.carloan();
		obj.credit();
		obj.debit();
		obj.eductionLoan();
		obj.transferMoney();
		
		
	UsBank ban	= new HsbcBank();
	ban.credit();
	ban.debit();
	ban.transferMoney();
	
	}

}
