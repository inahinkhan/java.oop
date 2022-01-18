package List;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkLists 
{
       public static void main(String[] args)
        {
    	   LinkedList<String> student=new LinkedList<String>();
    	  
    	   Scanner input=new Scanner(System.in);
    	   System.out.print("Enter Student Number: ");
    	   int N=input.nextInt();
    	   System.out.println("Enter Name: ");
    	   String s=input.nextLine();
    	   
    	  for(int i=0;i<N;i+=1)
		        {
		        	 s=input.nextLine();
		        	 
		        	 student.add(s);
		        	
		        }
    	 
    	              System .out.println("\t----------------------------------");
    	              System.out.println("\t-                                      ");
    	              System.out.println("\t-     \"STUDENT LIST\"    - ");
    	              System.out.println("\t-                                      ");
    	              System.out.println("\t----------------------------------");
    	            
    	              for(String Name:student)
    			       {
    			        	
    	                	 System.out.println("Name: "+Name);
    			       }
                student.addFirst("NAHIN");
	              student.addLast("KHAN");
	              for(String Name:student)
			       {
			        	
	                	 System.out.println("Name: "+Name);
			       }
	              student.remove(3);
	              for(String Name:student)
			       {
			        	
	                	 System.out.println("Name: "+Name);
			       }
	              
	              student.clear();
                
              
               
		       System.out.println(student.size());       //    [ Size of LinkedList ]
		        
		        input.close();
		    
		      
	    }
}
