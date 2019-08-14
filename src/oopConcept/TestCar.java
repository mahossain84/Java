package oopConcept;

public class TestCar {

	public static void main(String[] args) {
		// i have to know this qustion defenation what is top casting * and down casting
		//static polymorphise ------complie time polymorphise
		
		Bmw b = new Bmw();
		b.stop();
		b.Start();
		b.refuel();
		b.saftey();
		b.engine();
	
		Car c = new Car();
		c.refuel();
		c.Start();
		c.stop();
		c.engine();
		
		
		System.out.println("**********");
			// top cousting 
	Car c1 = new Bmw (); //child class object can be refferd by parents class -
	//referance variable - its call dynamick polimorpishom or run time polimorpisom.
	
		c1.Start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
	//	Bmw t = new Car();

	}

}
