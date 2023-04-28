 class Student{
    String name;
    int rollNo;
    int agr;

}

public class ArrayOfObjects {
    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.name="Raja";
        s1.rollNo=5;
        s1.agr=19;

        Student s2 = new Student();
        s2.name="Khushi";
        s2.rollNo=6;
        s2.agr=19;

        Student s3 = new Student();
        s3.name="Rauki";
        s3.rollNo=7;
        s3.agr=19;

        Student s4 = new Student();
        s4.name="MR";
        s4.rollNo=23;
        s4.agr=18;



        Student students[] = new Student[4];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;


        for(int i=0; i<students.length ;  i++)
        {
          System.out.println("Name : " + students[i].name + " , RollNo : " + students[i].rollNo + " , Age : " + students[i].agr );
        }
      

    //           int nums[] = new int[6];
	//      	nums[0]=4;
	//      	nums[1]=8;
	//      	nums[2]=3;
	//      	nums[3]=9;
	//      	
	//      	for(int i=0;i<nums.length;i++)
	//      	{
	//               System.out.println(nums[i]);
	//      	}
    }
}
