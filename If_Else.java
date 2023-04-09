public class If_Else {

	public static void main(String[] args) {
		int x1=8;
		System.out.println("Hello");
		System.out.println("Bye");
        System.out.println("---------------------");
		
		int x2=18;
		if(x2>10) {
			System.out.println("Hello");
		}
        System.out.println("---------------------");
		
		if(true) {
			System.out.println("Hello");
		}
        System.out.println("---------------------");
		
		int x3=18;
    		if(x3>10 && x3<=20) {       //11-20
			System.out.println("Hello");
		}
		System.out.println("Bye");
        System.out.println("---------------------");
		
		int x4=28;
		if(x4>10 && x4<=20) {       //11-20
			System.out.println("Hello");
		}
		else
		System.out.println("Bye");
		System.out.println("---------------------");
        
		int x5=8;
		int y5=7;
		if(x5>y5) {
			System.out.println(x5);
			System.out.println("-------Thank you--------");
		}
		else
			System.out.println(y5);		
	}

}