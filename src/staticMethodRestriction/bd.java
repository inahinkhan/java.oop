package staticMethodRestriction;

public class bd
{
        String name="Bangladesh";
        void run()
        {
        	System.out.println(name);
        	System.out.println(NAME);
        	RUN();
        }
        static String NAME="BANGLADESH";
        static void RUN()
       {
    	  
    	   System.out.println(NAME+" is a smalll country");
       }
}
//static method can't be overridden,cause static method bound to class, otherhand method is bound to object
//we can't override java main method cause .main method also static method'