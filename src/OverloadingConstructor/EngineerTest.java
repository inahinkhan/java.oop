package OverloadingConstructor;

public class EngineerTest
{
      public static void main(String[] args)
      
        {
	           Engineer No1=new Engineer()	;
	           System.out.println("\n");
	           Engineer No2=new Engineer("Nahin Khan",19);
	           No2.display();
	           System.out.println("\n");
	           Engineer No3=new Engineer("Nahin Khan",19,"Computer Science Engineer")	;
	           No3.display();
	    }
}
