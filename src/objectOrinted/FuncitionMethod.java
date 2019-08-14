package objectOrinted;

public class FuncitionMethod {

	public static void main(String[] args) {
		
		FuncitionMethod p = new FuncitionMethod();
		p.test();
		int l = p.hello();
		System.out.println(l);
		int t = p.divison(20, 10);
		System.out.println(t);
		String k = p.world();
		System.out.println(k);
		
		// if u want to call non-statice ,u have to creat an object 
		/*why main method is void - because we never write return statement inside the 
		main method*/ 
		// fuction and method are same thing /is like kind of factory
		
		// java have 3 kind method 
		//1. no input no output 
		//2. no input only output 
		//3. some input some output
	}
	public void test() { // no input no output
		System.out.println("test method");
		
	}
	
	public int hello() {// no input only out put
		System.out.println("hello sum");
		int a = 10;
		int b = 3;
		int c =a +b;
		return c ;
	}
	
	public String world() { // no input only output
		System.out.println("hello world");
		String s ="selenium";
		return s;
	}
	
	public int divison(int x , int y) { // input parameter or input argument 
		System.out.println("division method");
		int d = x/y;
		return d;
		
		
		
	}

}
