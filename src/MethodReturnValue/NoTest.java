package MethodReturnValue;
import java.util.Scanner;
public class NoTest
{
        public static void main(String[] args)
        {
			    Scanner input=new Scanner(System.in);
			    System.out.print("Enter Number: ");
			    int N=input.nextInt();
        	    No r=new No();
			    r.Num(N);
			    System.out.println("Squre of "+N+" = "+r.Num(N));
		}
}
