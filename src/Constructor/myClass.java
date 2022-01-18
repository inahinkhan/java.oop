package Constructor;

//Create a MyClass class
public class myClass{
	int x; // Create a class attribute x

// Create a class constructor for the MyClass class
public myClass()
{
	x=5;
 }
void display()
{
	System.out.println(x);
}

public static void main(String[] args)
{
 // Create an myObj object of class MyClass (This will call the constructor)
 myClass Obj= new myClass(); 

 System.out.println(Obj.x);
 Obj.display();
}
}