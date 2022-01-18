package InheritingPrivateMember;

import java.util.Scanner;

public class Test extends Engineer
{
    public static void main(String[] args)
         {
        Engineer cinfo=new Engineer();
        CSE info=new CSE();
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Enter name: ");
		     String N=scan.nextLine();
		     System.out.print("Enter age: ");
		     int A=scan.nextInt();
		     System.out.print("Enter gender: ");
		     String G=scan.next();
		     System.out.print("Enter dept: ");
		     String Dt=scan.next();
		     System.out.print("Enter salary: ");
		     int S=scan.nextInt();
		     info.degree="B.Sc. in CSE";
		      
		    
		     System.out.println("\n\tEngineer Information");
		     
		         cinfo.setName(N);
		         cinfo.setAge(A);
		         cinfo.setGender(G);
		         cinfo.setDept(Dt);
		         cinfo.setSalary(S);
		         cinfo.show();
		         System.out.println("Degree: "+info.degree);
	     }
}
