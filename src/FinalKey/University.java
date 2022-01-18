package FinalKey;

public class University
{
      final String name="DIU";     // Declare final variable 
      final int fees;    //  Create blank final variable
    static final  String place;    //Create static final blank variable
      

      University()        //Create constructor for use blank final variable
      {
    	  fees=54000;
    	  
      }
      static //Create static block for use  static  blank final variable
      {
    	  place="Ashulia,Savar,Dhaka";
    	
      }
      
     
      void run()
      {
    	  System.out.println("Name: "+name);
    	  System.out.println("Tuttion Fee: "+fees);
    	  System.out.println("Place: : "+place);
      }
      
      
}
