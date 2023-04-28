
public class Vigibility_Check_For_Same_Class{
    public void Check1(){
         System.out.println(" public member ");
    }
    
    protected void Check2(){
        System.out.println(" protected member ");
   }
   
    private void Check3(){
    System.out.println(" private member ");
   } 
 
    void Check4(){
    System.out.println(" default member ");
   }
    public static void main(String[] args) {
       
        Vigibility_Check_For_Same_Class s1 = new Vigibility_Check_For_Same_Class();
    s1.Check1();
    s1.Check2();
    s1.Check3();
    s1.Check4();
    }
}