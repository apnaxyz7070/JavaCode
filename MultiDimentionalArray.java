

public class MultiDimentionalArray{
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		//inr random=0;
		//int random=(int)Math.random()*100;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*100);
				System.out.print("   "+nums[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("........................... MR ......");
	for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("   "+nums[i][j]);
			}
			System.out.println();
		}
        System.out.println("........................... MR ......");
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.print("   "+m);
			}
			System.out.println();
		}
	}
}

/*

OUTPUT:

PS D:\JavaCode> javac .\MultiDimentionalArray.java
PS D:\JavaCode> java MultiDimentionalArray        
   12   33   51   8
   42   44   79   23
   8   14   81   88
........................... MR ......
   12   33   51   8
   42   44   79   23
   8   14   81   88
........................... MR ......
   12   33   51   8
   42   44   79   23
   8   14   81   88
PS D:\JavaCode> 

*/