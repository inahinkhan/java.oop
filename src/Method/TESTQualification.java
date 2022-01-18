package Method;

import java.util.Scanner;

public class TESTQualification 
{
      public static void main(String[] args)
        {
		      Scanner input=new Scanner(System.in);
		      Qualification Person1=new Qualification();
		      System.out.println("Enter Name: ");
		      Person1.name=input.nextLine();
		      System.out.println("PSC Grade: ");
		      Person1.psc=input.nextFloat();
		      System.out.println("JSC Grade: ");
		      Person1.jsc=input.nextFloat();
		      System.out.println("SSC Grade: ");
		      Person1.ssc=input.nextFloat();
		      System.out.println("HSC Grade: ");
		      Person1.hsc=input.nextFloat();
		      Person1.display();
		      input.close();
	    }
}
