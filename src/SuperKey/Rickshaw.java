package SuperKey;

public class Rickshaw  extends Vehicle
{

	String use;
	Rickshaw(String name,String colour,int tire,double price,String use)
	{
		super(name,colour,tire,price); //calling the constructor of Vehicle class
		this.use=use;
	
	}
	  void print()
      {
		  super.print();
   	     System.out.println("Use in: "+use);
      }
}
