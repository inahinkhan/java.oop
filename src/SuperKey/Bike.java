package SuperKey;

public class Bike extends Vehicle
{
	String use;
    Bike(String name,String colour,int tire,double price,String use)
    {
    	
    	super(name,colour,tire,price); //calling the constructor of Vehicle class
    	this.use=use;
    	
    }
    void print1()
    {
		  super.print();
 	     System.out.println("Use in :"+use);
    }
}
