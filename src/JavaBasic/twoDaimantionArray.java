package JavaBasic;

public class twoDaimantionArray {
   public static void main(String[] args) {
	   
	   
	   
	   String  i [][] = new String [3][5];
	   
	   i [0][0] = "a";
	   i [0][1] = "b";
	   i [0][2] = "c";
	   i [0][3] = "d";
	   i [0][4] = "e";
	   
	   i [1][0] = "a1";
	   i [1][1] = "b1";
	   i [1][2] = "c1";
	   i [1][3] = "d1";
	   i [1][4] = "e1";
	   
	   i [2][0] = "a2";
	   i [2][1] = "b2";
	   i [2][2] = "c2";
	   i [2][3] = "d2";
	   i [2][4] = "e2";
	   
	   System.out.println(i[2][1]);
	   
	    System.out.println(i.length); // total number of raw 
	    
	    System.out.println(i[0].length); // total noumber colum
	    
	   for(int raw =0;raw<i.length;raw++) {
		   for(int cal =0;cal<i[0].length;cal++) {
			   System.out.println(i[raw][cal]);
		   }
		   
	   }
	    
	    System.out.println(i[0][1]);
	    
	    
	    }
}
	
	


