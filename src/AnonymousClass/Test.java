package AnonymousClass;

public class Test
{
    public static void main(String[] args)
     {
		  Engineer run=new Engineer()
		  {
			  void display()
			  {
				  System.out.println("Name : Nahin Khan\nAge: 19\nEducation: BSc in CSE");
			  }
		  };
		   run.display();
		  
	 }
}
