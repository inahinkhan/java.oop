package ExceptionHandling;

import java.util.Scanner;

public class Problem 
 {
          public static void main(String[] args)
             {
        	  int count=1;
        	  do
        	  {
        	  try {
        		  Scanner input=new Scanner(System.in);
		 	        System.err.print("Enter Number 1 : ");
		 	        int No1=input.nextInt();
		 	        System.err.print("Enter Number 2 : ");
		 	        int No2=input.nextInt();
		 	        double result=(double)No1/No2;
		 	        System.out.println("Result: "+No1+" / "+No2+" = "+result);
		 	        count++;
		 	        
        		  
        	    }catch(Exception E)
        	  {
        		  System.out.println("Exception "+E);
        		  System.out.println("Invalid! You must enter Number,Try again");
        	  }
        	  
        	  }while(count==1);
		 	      
		 	        
		     }
 }
