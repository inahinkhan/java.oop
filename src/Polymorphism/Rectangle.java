package Polymorphism;

public class Rectangle extends Area
{
     double length,width;
     Rectangle(double length,double width)
     {
    	    this.length=length;
    	    this.width=width;
     }
     double area()
 
 	{
    	System.out.print("Area of Rectangle: ");
 		return length*width;
 	}
     
}
