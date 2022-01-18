package Typecasting;

public class Test
{
        public static void main(String[] args)
          {
			     Student ob=new Teacher(); // Upcasting
			     ob.run();
			//     Teacher obj=(Teacher) new Student();  //Downcasting  ! It's not allow in java showing wrong in run time
			//     obj.run();
		  }
}
