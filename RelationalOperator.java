public class RelationalOperator{

	public static void main(String[] args) {
		int x=6;
		int y=5;
		boolean result1= x<y;
		boolean result2= x>y;
		boolean result3= x>=y;
		boolean result4= x<=y;
		boolean result5= x!=y;
		boolean result6= x==y;
		System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
		
		double a=8.8;
		double b=9.8;
		boolean res1 = a<=b;		
		boolean res2 = a>=b;
	
		System.out.println(res1);
        System.out.println(res2);
	}

}


/*
   OUTPUT :

   PS D:\JavaCode> javac .\RelationalOperator.java
PS D:\JavaCode> java RelationalOperator        
false
true
true
false
true
false
true
false
PS D:\JavaCode> 


 */