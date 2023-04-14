public class WhileLoop {

	public static void main(String[] args) {
		int i=1;
		
//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
		
		
//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);

		
		while(i<=4)
		{
			System.out.println("Hi"+ i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello"+j);
				j++;
			}
			i++;
		}
		System.out.println("Bye"+i);
	}
}


/*
 * OUTPUT:
 * 
 * PS D:\JavaCode> javac .\WhileLoop.java
PS D:\JavaCode> java WhileLoop        
Hi1
Hello1
Hello2
Hello3
Hi2
Hello1
Hello2
Hello3
Hi3
Hello1
Hello2
Hello3
Hi4
Hello1
Hello2
Hello3
Bye5
PS D:\JavaCode> 
 */