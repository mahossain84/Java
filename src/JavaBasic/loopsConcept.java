package JavaBasic;

public class loopsConcept {
	
	public static void main(String []args) {
		//what is disadvantage of loop? (interview Question 
		/* disadvantage of while if u dont give incremental or decremental part
		 *  while loop generate 
		 infinite loop,then pogram is terminitaed
		 */
		int i =0; //initiolization part 
		while(i<10) { // conditional part
			System.out.println(i);
			i = i+1; // incremental/decremental part
			
		}
		System.out.println("***********");
		
		// j++ meanse J= j+1;
		for(int j =1;j<=10;j++) {
			System.out.println(j);
		}
		
		
	}
}
