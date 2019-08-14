package objectOrinted;

public class WraperConcept {

	public static void main(String[] args) {
		
		// interview question (How to convert String to Integer) Navin java lesson 11 
		//Ans - parse in method .
		
		String x = "100";
		System.out.println(x+20);
		
		// data conversition string to integar 
		
	int i =	Integer.parseInt(x);
	System.out.println(i+20);
		String y = "12.33";
		
		System.out.println(y +20);
		
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		String k = "true";
		
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		int p = 200;
		
		System.out.println(p+20);
		
		String s = String.valueOf(p);
		System.out.println(s+20);
		
		
		
		String a ="100A"; // 100A is not pure number 0r numaric valu
		Integer.parseInt(a); // if u want to convert string to integer , it has to pure number
		// no letter can ot be added.
		
		// interview question - if u want to convert String to integer, string 
		// is not pure integer or  numaric valu ,what exception u get.
		// ans - is give me NumberFormatException; 
		
	}

}
