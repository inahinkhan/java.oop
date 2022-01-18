package SuperKey;

public class Vehicle
{
       String name,colour;
       int tire;
       double price;
       Vehicle(String name,String colour,int tire,double price)
       {
    	   this.name=name;
    	   this.colour=colour;
    	   this.tire=tire;
    	   this.price=price;
       }
       void print()
       {
    	   System.out.println("Name: "+name);
    	   System.out.println("Colour: "+colour);
    	   System.out.println("Tire Number: "+tire);
    	   System.out.println("Price is : "+price+" tk");
       }
}
