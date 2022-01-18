package ExceptionHandling;

public class Wrong 
{
     public static void main(String[] args)
       {
	           	try {
	           	  int x=10;
		           	int y=0;
	            	System.out.println(x/y);
	           	}catch(ArrayIndexOutOfBoundsException E)   // It's ArithmeticException
	           	{
	           		System.out.println("Exception is: "+E);
	           	}
	           	catch(ArithmeticException E2)   // It's ArithmeticException
	           	{
	           		System.out.println("Exception is: "+E2);
	           	}
	           	
	           	finally
	           	{
	           		System.out.println("Last Line of Code");
	           	}
    	      
	           	
	   }
}
