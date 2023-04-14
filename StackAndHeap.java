class Calculator
{
	int num=5;
	public int add(int n1, int n2)
	{
		System.out.println(num);
		return n1+n2;
	}
}


public class StackAndHeap {
	public static void main(String[] args) {
		int data=10;   // Allocate in  Stack Memory
		Calculator obj=new Calculator();  //  obj & obj1 in Stack memory. But Object allocate in Heap Memory.
		Calculator obj1=new Calculator();
		int r1=obj.add(3,4);
		//System.out.println(r1);
		obj.num=8;
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
}
/*
OUTPUT:

PS D:\JavaCode> javac .\StackAndHeap.java
PS D:\JavaCode> java StackAndHeap        
5
8
5
PS D:\JavaCode> 

*/