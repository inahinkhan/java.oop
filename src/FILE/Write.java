package FILE;

import java.util.Formatter;

public class Write 
{
     public static void main(String[] args)
       {
    	 try {
		          Formatter write=new Formatter("C:/Users/Asus/OneDrive/Desktop/Engineer/Student.txt");
		          write.format("%s %s\r\n","097","Nahin");
		          
		          
		          write.close();
    	 }catch(Exception E)
    	 {
    		 System.out.println(E);
    	 }
	   }
}
