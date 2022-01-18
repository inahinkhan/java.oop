package Typecasting;

public class Check 
{
     public static void main(String[] args) 
     {
		// byte - short - int - long - float - double [widening]
    	  int no=20;
    	  float n=no;
    	  System.out.println(n);
    	  
         //double - float - long - int - short - byte [Narrowing]
    	  double data=24.45;
    	  int math= (int) data;
    	  System.out.println(math);
	 }
}
