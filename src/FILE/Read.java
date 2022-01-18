package FILE;

import java.io.File;
import java.util.Scanner;

public class Read
{
     public static void main(String[] args)
       {
    	 try
    	 {
    		 File read=new File("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.txt");
    		 Scanner input=new Scanner(read);
    		 while(input.hasNext())
    		 {
        		 String id=input.next();
        		 String name=input.next();
        		 System.out.println(id+name);
    		 }
    		 input.close();

    	 }catch(Exception E)
    	 {
    		  System.out.println(E);
    	 }
		        
	   }
}
