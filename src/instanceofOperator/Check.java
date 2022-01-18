package instanceofOperator;

public class Check
{
     public static void main(String[] args)
       {
		          Person P=new Person();
		          Doctor D=new Doctor();
		          Engineer E=new Engineer();
		          System.out.println(D  instanceof Person);
		          System.out.println(E  instanceof Person);
		          System.out.println(P instanceof Engineer);
	    }
} 
