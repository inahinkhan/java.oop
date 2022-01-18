package staticBlock;

public class staticBlock
{
   static String name,address;
   static
   {
	     name="Nahin Khan";
	     address="Munshignaj,Dhaka,Bnagladesh";
   }
    static void show()
   {
	   System.out.println("Name: "+name);
	   System.out.println("Address: "+address);
   }
}
