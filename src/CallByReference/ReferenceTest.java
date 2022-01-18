package CallByReference;

public class ReferenceTest
{
    public static void main(String[] args)
       {
	         Reference SHOW=new Reference();
	         SHOW.Data=10;
	         System.out.println("Before call reference: "+SHOW.Data);
	         SHOW.data(SHOW);
	         System.out.println("After call reference: "+SHOW.Data);

    	}
}
