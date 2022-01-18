package Recurrsion;

public class Fact
{
    int Factor(int N)
     {
    	 if(N==0 || N==1)
    	 {
    		 return 1;
    	 }
    	 else
    	 {
    		 return N*Factor(N-1);
    	 }
    	 
    	 
    	 
    	 
     }
}
