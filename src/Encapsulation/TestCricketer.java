package Encapsulation;

public class TestCricketer
{
      public static void main(String[] args)
         {
	               Cricketer info=new Cricketer();
	               info.setName("Sakib Al Hasan");
	               info.setAge(34);
	               info.setPosition(1);
	               
	               System.out.println("\t\tCricketer List\n");
	               System.out.println("Name: "+info.getName());
	               System.out.println("Age: "+info.getAge());
	               System.out.println("Allrounder Position: "+info.getPosition());
	     }
}
