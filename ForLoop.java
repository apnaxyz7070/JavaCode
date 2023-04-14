public class ForLoop{

	public static void main(String[] args) {
		/*
        for(int i=0;i<=4;i++)
		{
			System.out.println("Hi"+i);
		}
		
		*/
		for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
		
		
		/*
        int i=1;
		for(;i<=5;)
		{
			System.out.println("DAY"+i);
			i++;
		}
        */
	}
}
/*
OPTPUT:

PS D:\JavaCode> javac .\ForLoop.java
PS D:\JavaCode> java ForLoop        
Day1
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day2
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day3
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day4
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day5
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day6
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
Day7
 9-10
 10-11
 11-12
 12-13
 13-14
 14-15
 15-16
 16-17
 17-18
PS D:\JavaCode> 

*/