package Polymorphism;

public class Triangle extends Area
{
	double height,base;
	Triangle(double height,double base)
	{
		this.height=height;
		this.base=base;
	}
	
	double area()
	{
		System.out.print("Area of Triangle ");
		return (0.5*height*base);
	}
}
