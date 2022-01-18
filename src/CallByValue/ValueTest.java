package CallByValue;

public class ValueTest 
{
     public static void main(String[] args)
         {
		       Value check=new Value();
		       int set=10;   //Actual Value
		       System.out.println("Before Call Value: "+set);
		       check.data(set);
		       System.out.println("After Call Value: "+set);
	    }
}
