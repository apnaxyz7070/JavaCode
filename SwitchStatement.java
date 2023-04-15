

public class SwitchStatement{

	public static void main(String[] args) {
//		int n=1;
//		if(n==1)
//			System.out.println("Monday");
//		else if(n==2)
//			System.out.println("Tuesday");
//		else if(n==3)
//		System.out.println("Wednesday");
//		else if(n==4)
//		System.out.println("Thursday");
//		else if(n==5)
//		System.out.println("Friday");
//		else if(n==6)
//		System.out.println("Saturday");
//		else
//		System.out.println("Sunday");
		

        int n=8;
        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
                break;
            case 4:
            System.out.println("Thursday");
                break;
            case 5:
            System.out.println("Friday");
                break;
            case 6:
            System.out.println("Saturday");
                break;
            case 7:
            System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");			
            }

        }

}


/*
 // New Switch Syntex :- In this syntex colon(:) and break statement not allowed.
       int n=4;
		switch(n) {
		case 1->
			    System.out.println("Monday");
		case 2->
			    System.out.println("Tuesday");
		case 3->
	        	System.out.println("Wednesday");
		case 4->
		        System.out.println("Thursday");
		case 5->
		        System.out.println("Friday");
		case 6->
	            System.out.println("Saturday");
		case 7->
		        System.out.println("Sunday");
		default->
			    System.out.println("Enter a valid number");			
		}
*/
/* 

// New Switch Syntex :- In this syntex break statement not allowed.
        int n=4;
		int s=switch(n)
        {
		case 1 :yield 1;
		case 2 :yield 2;
		case 3 :yield 3;
		case 4 :yield 4;
		case 5 :yield 5;
		case 6 :yield 6;
		case 7 :yield 7;
		default :yield 8;		
		};
		System.out.println(s);
   }

} 

*/