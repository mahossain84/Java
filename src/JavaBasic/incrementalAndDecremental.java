package JavaBasic;

public class incrementalAndDecremental {

	public static void main(String[] args) {
		
	int i = 1;
	int j = i++; //post increment
	
	System.out.println(i);
	System.out.println(j);
	
	System.out.println("*******");
	
	int p = 1;
	int q = ++p; //pre increment
		
	System.out.println(p);
	System.out.println(q);
	
	System.out.println("*******");
	int n = 2; // post decrement 
	int m = n--;
	System.out.println(n);
	System.out.println(m);
	
	System.out.println("*******");
	int x =2; // pre decrementj
	int y = --x;
	System.out.println(x);
	System.out.println(y);
		
	}
}
