public class Literals {
    public static void main (String args[])
    {
        int n1=0b101;
        System.out.println(n1);

        int n2=0x7E;
        System.out.println(n2);

        int n3=100_000_00_00;
        System.out.println(n3);
        
        float n4=56;
        System.out.println(n4);

        double n5=56;
        System.out.println(n5);

        double n6=12e10;
        System.out.println(n6);

        boolean n7=true;
        System.out.println(n7);

        char c1='R';
        System.out.println(c1);
        c1++;

        char c2='R';
        c2++;
        System.out.println(c2);

    }
}


/*
 OUTPUT :

PS D:\JavaCode> javac .\Literals.java
PS D:\JavaCode> java Literals        
5
126
1000000000
56.0
56.0
1.2E11
true
R
S
PS D:\JavaCode> 
 
*/