package JavaBasic;

public class arrayConcept {
	
	public static void main(String[] args) {
		
		// arry -  to store samilar data type valus in a array variable
		//advantange of array - i can store multiple valu in a single varuavle 
		// disadvantage of array - size is fix(thats why is call static array). 
		// store only samillar data type over come this problem we use object array .... collection 
		// arraylist ,hastable ....its also call dynamic array;
		int i [] = new int [4] ;
		i[0] = 10;
		i[1] = 20;
		i[2] = 25;
		i[3] = 27;
		System.out.println(i[3]);
		System.out.println(i.length); // size or lenth of Array
		
		// print all the valu of array i have to use for loop
		
		for(int p =0;p<i.length;p++) {
			System.out.println(i[p]);
		}
	//	System.out.println();
		
	// is size doesen't exit is give arrayindexoutofboundexception.
		int sum = i[0] +i[1] +i[2]+i[3];
		System.out.println("sum " + sum);
		
		double d [] = new double [3];
		d[0] = 12.33;
		d[1] = 12.67;
		d[2]= 56.47;
		System.out.println(d[0]);
		System.out.println(d.length);
		double add = d[0]+d[1]+d[2];
		System.out.println("add result " +add);
		for(int x =0;x<d.length;x=x+1) {
			System.out.println(d[x]);
			
			// object is super class of all the class.
			
			Object ob [] = new Object[4];
			ob [0] = "sl";
			ob [1] = 12.33;
			ob [2] = 'c';
			ob [3] = 5;
			System.out.println(ob[2]);
		}
	}
}