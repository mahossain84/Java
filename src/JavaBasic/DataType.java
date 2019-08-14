package JavaBasic;

public class DataType {
	static byte byteValu; 
	static int intValu;
	static double d;
	static char c;
	static boolean b;
	private static CharSequence e;
	private static CharSequence a;

	

	public static void main(String[] args) {
		
	
		
        
        System.out. println("Byte valu: "+ byteValu);
        
        
        System.out.println("int valu: " + intValu);
        
       
        System.out.println("double valu: "+ d);
         
      
        System.out.println("char valu :"+ c);
        
        
       
        System.out.println("boolean valu :" + b);
        
        String st =   "Hello";
        System.out.println(st);
        
        String su = new String("tuki");
        System.out.println(su);
        
        String sw = "hello6";
        String sl = "hello6";
        String sj = "welcome";
        String ss = "abcf";
        
        
        		
        String sp = "this is the test string";
        System.out.println(sp.length());
        System.out.println(sp.charAt(2));
        System.out.println(sp.concat(" this thei string"));
        System.out.println(sp.contains("ls"));
        System.out.println(sp.startsWith("Q"));
        System.out.println(sp.endsWith("string"));
        System.out.println(sw.equals(sj));
       System.out.println(sp.indexOf('g'));
       System.out.println(ss.replace('b', 'a'));
        
       
       int [] myarray;
       myarray = new int [10];
       
       int a = 10;
       int b = 15;
       
       if (a<b) {
    	   System.out.println("b is greater than a");
    	   
       } else {
    	   System.out.println("a is grater than b");
       }
       
       int c = 40;
       int d =40;
        if (c==d) {
        	System.out.println("a and b are equail");
        	
        } 
        else {
        	System.out.println("a and b are not equal");
        	
        
        	
        }
       int a1 = 100;
       int b1 = 200;
       int c1 = 300;
       
        if(a1>b1 & a1>c1){ // flase &flase = flase 
        	System.out.println("a1 is grater than b1");
        	
        }
        else if (b1>c1) {
        	System.out.println("b1 is gretest");
        }
        else {
        	System.out.println("c1 is greast");
        }
        
        
        
       int  x = 20;
       int y = 40;
       
       System.out.println("total addition " + (x+y));
       System.out.println("total divindedn " +(y/x));
        
       
       }
       
       
       
	}
	
	

	
	






