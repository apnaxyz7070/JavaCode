public class TypeConversion{
    public static void main(String args[])
    {
        byte b=127;
        int a=b;
        System.out.println(b);
        System.out.println(a);

         int n1=255;
         byte by=(byte)n1;      //Incompatible type conversion: 
         System.out.println(by);  // Garbaje value print.

       float f=254.54f;
       int a1=(int)f;      // Data loss.
       System.out.println(a1);

       byte b1=25;
       byte b2=10;
       int i=b1*b2;
       System.out.println(i);

    }
}

/*OUTPUT
 
PS D:\JavaCode> javac .\TypeConversion.java
PS D:\JavaCode> java TypeConversion        
127
127
-1
254
250
PS D:\JavaCode> 

*/