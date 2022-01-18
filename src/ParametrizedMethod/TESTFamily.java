package ParametrizedMethod;

import java.util.Scanner;

public class TESTFamily
{
       public static void main(String[] args)
         {
    	   
		         Scanner input=new Scanner(System.in);
		             Family no1=new Family();
		                  System.out.print("Enter name: ");
		        		  no1.name=input.nextLine();
		        		  System.out.print("Enter gender: ");
		                  no1.gender=input.nextLine();
		                  System.out.print("Enter age: ");
		                  no1.age=input.nextInt();
		                  System.out.print("Enter height: ");
		                  no1.height=input.nextFloat();
		                  
		                   no1.set(no1.name, no1.gender, no1.age, no1.height);
		                   no1.display();
		                   input.close();
		       }
		                  
}

