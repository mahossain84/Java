package objectOrinted;

public class CallByValeAndCallByRefarance{
	/* interview question (navin class 12 )
	 * what is different call by value and call bye refarance
	 */
	int p;
	int q;

	public static void main(String[] args) {
		// what is call b call bye valu
		// call by refarance is possible in java by object efarance 
		CallByValeAndCallByRefarance obj = new CallByValeAndCallByRefarance();
		int x = 10;
		int y = 20;
	    int i =	obj.testSum(x, y); // this is call by valu or pass ny valu
	    System.out.println(i);
	    obj.p = 50;
	    obj.q = 60;
	    obj.sweap(obj);
	    System.out.println(obj.q);
	    
	}
	public int testSum(int a , int b) {
		int c = a+b;
		return c;
	}
	
	public void sweap(CallByValeAndCallByRefarance t) { // call bye refarance 
		//
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
 
}
