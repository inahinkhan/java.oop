package Polymorphism;

public class VarsityTest
{
        public static void main(String[] args)
        {
        	
        	System.out.println("\t\" DIU Student Info \"\n");
			Varsity info=new Varsity();
			info.play("Nahin Khan", 19, "201-15-3097");
			info.play();
			System.out.println();
			Varsity info1=new Varsity();
			info1.play("NAHIN KHAN", 19, "201-15-3097", "MALE");
			info1.play();
			
		}
}
