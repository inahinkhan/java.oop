package MethodOverloading;

public class Data 
{
	
	    void data()
	    {
	    	System.out.println("No Data");
	    }
        void data(int a,int b,int c)
        {
        	System.out.println("Sum of data: "+(a+b+c));
        }
        void data(int a,int b)
        {
        	System.out.println("Multyply of data: "+(a*b));
        }
        void data(double a,double b)
        {
        	System.out.println("Multyply of data: "+(a*b));
        }
}
