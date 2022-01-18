package varargs;

public class ArgsTest
{
     public static void main(String[] args)
     {
		  Args run=new Args();
		  run.set("Nahin");
		  run.set("Nahin Khan","KING");
		  run.set("CSE","DIU");
		  run.play(3);
		  run.play(5,5,5);
	 }
}
