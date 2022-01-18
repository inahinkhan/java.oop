package Recurrsion;

import java.util.Scanner;

public class FactorTest
{
       public static void main(String[] args)
          {
		        Scanner input=new Scanner(System.in);
		        System.out.print("Enter Value: ");
		        int N=input.nextInt();
		        Fact O=new Fact();
		        int F=O.Factor(N);
		        System.out.println("Factorial of "+N+" = "+F);
	      }

}
