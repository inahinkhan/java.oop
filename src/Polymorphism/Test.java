package Polymorphism;

public class Test
{
         public static void main(String[] args)
          {
        	 Area A=new Area();
             Area R=new Rectangle(10,20);
             Area T=new Triangle(10,20);
           
             System.out.println(A.area());
             System.out.println( R.area());
             System.out.println(T.area());
		  }
        
}
