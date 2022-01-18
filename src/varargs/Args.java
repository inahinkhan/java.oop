package varargs;

public class Args
{
	String name;
	int data;
        void set(String ... name)
        {
        	
        	 for(String N: name)
        	 {
        		  System.out.print("\t"+N);
        		
        	 }
        	  System.out.printf("\n");
        }
        void play(int ... data)
        {
        	int multyply=1;
        	for(int N: data)
        	{
        		multyply=multyply*N;
            }
        	System.out.println(multyply);
        }
}
